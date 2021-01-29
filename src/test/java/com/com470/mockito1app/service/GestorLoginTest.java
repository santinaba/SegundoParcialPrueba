/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.mockito1app.service;

import com.com470.mockito1app.controller.ICuenta;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.com470.mockito1app.controller.ICuenta.InventoryException;
import com.com470.mockito1app.controller.ICuenta.

/**
 *
 * @author Igor
 */
public class GestorLoginTest {

    public GestorLoginTest() {
    }
    @Mock
    ICuenta cuenta;
    GestorLogin repo;
    @Before
    public void inicializarTest() {
        repo=mock(GestorLogin.class);
        when(repo.buscar("pepe")).thenReturn(cuenta);
        
    }

    @Test
    public void testAccesoConcedidoALaPrimera() {
        when(cuenta.claveCorrecta("1234")).thenReturn(true);
    }

    @Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }

}
