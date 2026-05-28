package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCoNghiem() {
        App app = new App();
        String ketQua = app.giaiPhuongTrinhBac1(2, -4);
        assertEquals("CN: x = 2.0", ketQua);
    }

    @Test
    public void testVoSoNghiem() {
        App app = new App();
        String ketQua = app.giaiPhuongTrinhBac1(0, 0);
        assertEquals("VSN", ketQua);
    }

    @Test
    public void testVoNghiem() {
        App app = new App();
        String ketQua = app.giaiPhuongTrinhBac1(0, 5);
        assertEquals("VN", ketQua);
    }
}