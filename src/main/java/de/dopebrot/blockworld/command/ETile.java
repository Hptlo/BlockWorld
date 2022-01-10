package de.dopebrot.blockworld.command;

import org.bukkit.Material;

public enum ETile {

    DIRT((byte) 0, (short) 0, Material.DIRT),
    STONE((byte) 0, (short) 1, Material.STONE),
    WOOD((byte) 0, (short) 2, Material.WOOD),
    SAND((byte) 0, (short) 3, Material.SAND),
    GRAVEL((byte) 0, (short) 4, Material.GRAVEL),
    LOG((byte) 1, (short) 5, Material.LOG),
    ORE_COAL((byte) 1, (short) 6, Material.COAL_ORE),
    ORE_IRON((byte) 1, (short) 7, Material.IRON_ORE),
    ORE_GOLD((byte) 1, (short) 8, Material.GOLD_ORE),
    ORE_DIAMOND((byte) 1, (short) 9, Material.DIAMOND_ORE),
    COAL((byte) 2, (short) 10, Material.COAL),
    IRON_INGOT((byte) 2, (short) 11, Material.IRON_INGOT),
    GOLD((byte) 2, (short) 12, Material.GOLD_INGOT),
    DIAMOND((byte) 2, (short) 13, Material.DIAMOND),
    CHEST((byte) 2, (short) 14, Material.CHEST);

    public byte type;
    public Material material;
    public short id;

    ETile() {
    }

    ETile(byte type, short id, Material material) {
        this.type = type;
        this.material = material;
        this.id = id;
    }

    public static ETile getByID(short id) {
        for (ETile e : values()) {
            if (e.id == id) return e;
        }
        return null;
    }

}
