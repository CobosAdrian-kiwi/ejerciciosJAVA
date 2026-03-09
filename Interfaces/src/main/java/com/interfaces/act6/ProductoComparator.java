package com.interfaces.act6;

import java.util.Comparator;

public class ProductoComparator {

	public static Comparator<Producto> PRECIO_DESC =
			(a,b) -> Double.compare(a.getPrecio(),b.getPrecio());
			
	public static Comparator<Producto> COD_A_Z =
			(a,b) -> a.getCodigo().compareTo(b.getCodigo());
}
