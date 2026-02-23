package com.interfaces.prueba;

import java.awt.Color;

public interface Coloreado {
	Color getColor();
	
	default Color getColorInverso() {
		Color c = getColor();
		return new Color (255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
	}
}
