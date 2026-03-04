package es.edwardbelt.hycraft.network.handler.minecraft.data.nbt;

import es.edwardbelt.hycraft.protocol.io.PacketBuffer;
import lombok.Getter;

import java.nio.charset.StandardCharsets;

@Getter
public class NbtBoolean extends NbtByte {

    public NbtBoolean(boolean value, String name) {
        super(name);
        this.value = getByteByBool(value);
    }

    public NbtBoolean(boolean value) {
        this(value, null);
    }

    private byte getByteByBool(boolean value) {
        return value ? 1 : 0;
    }
}
