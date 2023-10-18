package com.primogemstudio.primogemcraft.gacha.serialize;

import java.util.Arrays;

public class TestData {
    public int num;
    public String string;
    public Inner inner;

    public TestData(String str, int n) {
        string = str;
        num = n;
    }

    @Override
    public String toString() {
        return num + string + inner.toString();
    }

    public static class Inner {
        public float num;
        public int[] array;

        @Override
        public String toString() {
            var sb = new StringBuilder();
            Arrays.stream(array).forEach(i -> {
                sb.append(i);
                sb.append(',');
            });
            return num + "&" + sb;
        }
    }
}
