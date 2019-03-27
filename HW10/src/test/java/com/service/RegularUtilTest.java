package com.service;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularUtilTest {
    private List<String> listPhone;
    private List<String> listEmail;
    private List<String> listDate;
    private List<String> listIp;

    @Before
    public void setUp() {

        listPhone = new ArrayList<>();
        listPhone.add("+38(099)452-32-00");
        listPhone.add("+38(067)111-22-00");
        listPhone.add("38(096)001-02-03");
        listPhone.add("38(050)002-03-03");

        listDate = new ArrayList<>();
        listDate.add("07.02.2018");
        listDate.add("01.03.2009");
        listDate.add("01.06.2000");
        listDate.add("12.09.2001");
        listDate.add("20.10.2010");
        listDate.add("06.06.1970");

        listEmail = new ArrayList<>();
        listEmail.add("akulmm@gmail.com");
        listEmail.add("akul@gmail.com");
        listEmail.add("ankulm@gmail.com");
        listEmail.add("amkulDeveloper@gmail.com");

        listIp = new ArrayList<>();
        listIp.add("192.168.0.0");
        listIp.add("192.168.0.10");
        listIp.add("10.8.8.1");
        listIp.add("192.168.10.1");
        listIp.add("255.255.255.0");
    }

    @Test
    public void testPhoneNumber() {
        assertTrue(RegularUtil.isPhoneNumber(listPhone.get(0)));
        assertTrue(RegularUtil.isPhoneNumber(listPhone.get(1)));
        assertFalse(RegularUtil.isPhoneNumber(listPhone.get(2)));
    }

    @Test
    public void testEmail() {
        assertTrue(RegularUtil.isEmail(listEmail.get(0)));
        assertTrue(RegularUtil.isEmail(listEmail.get(1)));
        assertTrue(RegularUtil.isEmail(listEmail.get(2)));
        assertTrue(RegularUtil.isEmail(listEmail.get(3)));
    }

    @Test
    public void testDate() {
        assertTrue(RegularUtil.isDate(listDate.get(0)));
        assertFalse(RegularUtil.isDate(listDate.get(1)));
        assertFalse(RegularUtil.isDate(listDate.get(2)));
        assertFalse(RegularUtil.isDate(listDate.get(3)));
        assertTrue(RegularUtil.isDate(listDate.get(4)));
        assertFalse(RegularUtil.isDate(listDate.get(5)));

    }

    @Test
    public void testIp() {
        assertTrue(RegularUtil.isIP(listIp.get(0)));
        assertFalse(RegularUtil.isIP(listIp.get(1)));
        assertFalse(RegularUtil.isIP(listIp.get(2)));
        assertTrue(RegularUtil.isIP(listIp.get(3)));
    }
}
