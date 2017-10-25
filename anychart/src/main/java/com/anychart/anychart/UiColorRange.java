package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class UiColorRange extends CoreAxesLinear {

    public UiColorRange() {

    }

    protected UiColorRange(String jsBase) {
        this.jsBase = jsBase;
    }

    protected UiColorRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private EnumsAlign align;
    private String align1;

    public UiColorRange setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiColorRange setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double colorLineSize;

    public UiColorRange setColorLineSize(Double colorLineSize) {
        if (jsBase == null) {
            this.colorLineSize = colorLineSize;
        } else {
            this.colorLineSize = colorLineSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colorLineSize(%f)", colorLineSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colorLineSize(%f)", colorLineSize));
                js.setLength(0);
            }
        }
        return this;
    }

    private String length;
    private Double length1;

    public UiColorRange setLength(String length) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length = length;
        } else {
            this.length = length;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".length(%s)", wrapQuotes(length)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%s)", wrapQuotes(length)));
                js.setLength(0);
            }
        }
        return this;
    }


    public UiColorRange setLength(Double length1) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length1 = length1;
        } else {
            this.length1 = length1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".length(%f)", length1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%f)", length1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersfactoryMarker getMarker;

    public UiMarkersfactoryMarker getMarker() {
        if (getMarker == null)
            getMarker = new UiMarkersfactoryMarker(jsBase + ".marker()");

        return getMarker;
    }

    private List<UiColorRange> getMarker1 = new ArrayList<>();

    public UiColorRange getMarker(UiMarkersfactoryMarker marker) {
        UiColorRange item = new UiColorRange(jsBase + ".marker(" + ((marker != null) ? marker.generateJs() : "null") + ")");
        getMarker1.add(item);
        return item;
    }

    private List<UiColorRange> getMarker2 = new ArrayList<>();

    public UiColorRange getMarker(String marker) {
        UiColorRange item = new UiColorRange(jsBase + ".marker(" + wrapQuotes(marker) + ")");
        getMarker2.add(item);
        return item;
    }


//
//    private String generateJSUiMarkersfactoryMarker getMarker() {
//        if (UiMarkersfactoryMarker getMarker != null) {
//            return UiMarkersfactoryMarker getMarker.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiColorRange getMarker1() {
//        if (UiColorRange getMarker1 != null) {
//            return UiColorRange getMarker1.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiColorRange getMarker2() {
//        if (UiColorRange getMarker2 != null) {
//            return UiColorRange getMarker2.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetMarker() {
        if (getMarker != null) {
            return getMarker.generateJs();
            //return String.format(Locale.US, "getMarker: %s,", ((getMarker != null) ? getMarker.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetMarker1() {
        if (!getMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiColorRange item : getMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMarker2() {
        if (!getMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiColorRange item : getMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarker());
        jsGetters.append(generateJSgetMarker1());
        jsGetters.append(generateJSgetMarker2());

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
//            js.append(generateJSalign());
////        
//            js.append(generateJSalign1());
////        
//            js.append(generateJScolorLineSize());
////        
//            js.append(generateJSlength());
////        
//            js.append(generateJSlength1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}