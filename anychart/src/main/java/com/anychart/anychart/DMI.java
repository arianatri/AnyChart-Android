package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class DMI extends JsObject {

    public DMI() {

    }

    protected DMI(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DMI(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double adxPeriod;

    public DMI setAdxPeriod(Double adxPeriod) {
        if (jsBase == null) {
            this.adxPeriod = adxPeriod;
        } else {
            this.adxPeriod = adxPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".adxPeriod(%f)", adxPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adxPeriod(%f)", adxPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getAdxSeries;

    public StockSeriesBase getAdxSeries() {
        if (getAdxSeries == null)
            getAdxSeries = new StockSeriesBase(jsBase + ".adxSeries()");

        return getAdxSeries;
    }

    private StockSeriesType type;
    private String type1;

    public DMI setAdxSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".adxSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adxSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public DMI setAdxSeries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".adxSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adxSeries(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getNdiSeries;

    public StockSeriesBase getNdiSeries() {
        if (getNdiSeries == null)
            getNdiSeries = new StockSeriesBase(jsBase + ".ndiSeries()");

        return getNdiSeries;
    }

    private StockSeriesType type2;
    private String type3;

    public DMI setNdiSeries(StockSeriesType type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ndiSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ndiSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public DMI setNdiSeries(String type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ndiSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ndiSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getPdiSeries;

    public StockSeriesBase getPdiSeries() {
        if (getPdiSeries == null)
            getPdiSeries = new StockSeriesBase(jsBase + ".pdiSeries()");

        return getPdiSeries;
    }

    private StockSeriesType type4;
    private String type5;

    public DMI setPdiSeries(StockSeriesType type4) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type4 = type4;
        } else {
            this.type4 = type4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".pdiSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pdiSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public DMI setPdiSeries(String type5) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type5 = type5;
        } else {
            this.type5 = type5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".pdiSeries(%s)", wrapQuotes(type5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pdiSeries(%s)", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double period;

    public DMI setPeriod(Double period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".period(%f)", period));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".period(%f)", period));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<DMI> getUseWildersSmoothing = new ArrayList<>();

    public DMI getUseWildersSmoothing(Boolean useWildersSmoothing) {
        DMI item = new DMI(jsBase + ".useWildersSmoothing(" + useWildersSmoothing + ")");
        getUseWildersSmoothing.add(item);
        return item;
    }


//
//    private String generateJSStockSeriesBase getAdxSeries() {
//        if (StockSeriesBase getAdxSeries != null) {
//            return StockSeriesBase getAdxSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getNdiSeries() {
//        if (StockSeriesBase getNdiSeries != null) {
//            return StockSeriesBase getNdiSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getPdiSeries() {
//        if (StockSeriesBase getPdiSeries != null) {
//            return StockSeriesBase getPdiSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSDMI getUseWildersSmoothing() {
//        if (DMI getUseWildersSmoothing != null) {
//            return DMI getUseWildersSmoothing.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetAdxSeries() {
        if (getAdxSeries != null) {
            return getAdxSeries.generateJs();
            //return String.format(Locale.US, "getAdxSeries: %s,", ((getAdxSeries != null) ? getAdxSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetNdiSeries() {
        if (getNdiSeries != null) {
            return getNdiSeries.generateJs();
            //return String.format(Locale.US, "getNdiSeries: %s,", ((getNdiSeries != null) ? getNdiSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetPdiSeries() {
        if (getPdiSeries != null) {
            return getPdiSeries.generateJs();
            //return String.format(Locale.US, "getPdiSeries: %s,", ((getPdiSeries != null) ? getPdiSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetUseWildersSmoothing() {
        if (!getUseWildersSmoothing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : getUseWildersSmoothing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAdxSeries());
        jsGetters.append(generateJSgetNdiSeries());
        jsGetters.append(generateJSgetPdiSeries());
        jsGetters.append(generateJSgetUseWildersSmoothing());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSadxPeriod());
////        
//            js.append(generateJStype());
////        
//            js.append(generateJStype1());
////        
//            js.append(generateJStype2());
////        
//            js.append(generateJStype3());
////        
//            js.append(generateJStype4());
////        
//            js.append(generateJStype5());
////        
//            js.append(generateJSperiod());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}