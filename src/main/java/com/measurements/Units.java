package com.measurements;

public enum Units {
    INCH("LENGTH",1.0),FOOT("LENGTH",12.0),YARD("LENGTH",36.0),CENTIMETER("LENGTH",.393701),
    KILOGRAM("WEIGHT",1.0),GRAMS("WEIGHT",.001),TONNE("WEIGHT",1000.0),
    LITER("VOLUME",1000.0),MILLILITER("VOLUME",1.0),GALLON("VOLUME",3780.00),
    CELCIUS("TEMPERATURE",1.0),
    KELVIN("TEMPERATURE",273.15),
    FAHRENHIET("TEMPERATURE",1.8,32.0)
   //. FAHRENHIETOUT("TEMPERATURE",32,(1.0/1.8))
    ;

    private final Object[] values;

    Units( Object ... values) {
        this.values = values;
    }

    public Object[] getValue() {
        return values;
    }



}
