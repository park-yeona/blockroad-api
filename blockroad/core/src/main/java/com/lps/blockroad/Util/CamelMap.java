package com.lps.blockroad.Util;

import java.util.HashMap;

import com.google.common.base.CaseFormat;



public class CamelMap extends HashMap<String, Object> {

    private static final long serialVersionUID = 6723434363565852261L;

    
	@Override
    public Object put(String key, Object value) {
        return super.put(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,(String) key), value);
    }

}