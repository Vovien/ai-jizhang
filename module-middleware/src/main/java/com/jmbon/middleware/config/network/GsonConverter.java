package com.jmbon.middleware.config.network;

import com.apkdv.mvvmfast.gson.GsonFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Type;

import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import rxhttp.RxHttpPlugins;
import rxhttp.wrapper.annotations.NonNull;
import rxhttp.wrapper.callback.IConverter;

public class GsonConverter implements IConverter {

    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");

    private final Gson gson;

    public static GsonConverter create() {
        return create(GsonFactory.getSingletonGson());
    }


    public static GsonConverter create(Gson gson) {
        if (gson == null) throw new NullPointerException("gson == null");
        return new GsonConverter(gson);
    }

    private GsonConverter(Gson gson) {
        this.gson = gson;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T convert(ResponseBody body, @NonNull Type type, boolean needDecodeResult) throws IOException {
        try {
            String result = body.string();
            if (needDecodeResult) {
                result = RxHttpPlugins.onResultDecoder(result);
            }
            if (type == String.class) return (T) result;
            return gson.fromJson(result, type);
        } finally {
            body.close();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> RequestBody convert(T value) throws IOException {
        TypeToken<T> typeToken = (TypeToken<T>) TypeToken.get(value.getClass());
        TypeAdapter<T> adapter = this.gson.getAdapter(typeToken);
        Buffer buffer = new Buffer();
        Writer writer = new OutputStreamWriter(buffer.outputStream(), Charsets.UTF_8);
        JsonWriter jsonWriter = gson.newJsonWriter(writer);
        adapter.write(jsonWriter, value);
        jsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }
}