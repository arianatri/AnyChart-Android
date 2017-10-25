package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class ChartA11y extends A11y {

    public ChartA11y() {

    }

    protected ChartA11y(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ChartA11y(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean enabled;

    public ChartA11y setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private A11yMode mode;
    private String mode1;

    public ChartA11y setMode(A11yMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public ChartA11y setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String titleFormat;

    public ChartA11y setTitleFormat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));
                js.setLength(0);
            }
        }
        return this;
    }


//

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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
//            js.append(generateJSenabled());
////        
//            js.append(generateJSmode());
////        
//            js.append(generateJSmode1());
////        
//            js.append(generateJStitleFormat());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}