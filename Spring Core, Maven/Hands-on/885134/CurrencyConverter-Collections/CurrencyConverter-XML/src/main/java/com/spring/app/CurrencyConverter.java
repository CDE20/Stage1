package com.spring.app;

import java.util.HashMap;

public class CurrencyConverter {

                private HashMap<String, String> mObj = new HashMap<String, String>();

                public HashMap<String, String> getmObj() {
                                return mObj;
                }

                public void setmObj(HashMap<String, String> mObj) {
                                this.mObj = mObj;
                }

                public int getTotalCurrencyValue(String value) {
                                HashMap<String, String> m = new HashMap<String, String>();

                                int totalCurrency = 0;
                                int currency = 0;
                                char[] name;
                                String number = "";
                                String x = "";
                                name = value.toCharArray();
                                for (int i = 0; i < name.length; i++) {
                                                if (Character.isDigit(name[i])) {
                                                                number = number + name[i];
                                                } else {
                                                                x = x + name[i];
                                                }
                                }
                                m = getmObj();
                                currency = Integer.parseInt(number);
                                String mapValue;
                                mapValue = mObj.get(x.toUpperCase());
                                int q = 0;
                                //System.out.println(mapValue);
                                q = Integer.parseInt(mapValue);
                                //System.out.println(q);
                                totalCurrency = q * currency;
                                return totalCurrency;

                }

}

