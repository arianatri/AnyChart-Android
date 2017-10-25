package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class RangeColors extends CoreBase {

    public RangeColors() {

    }

    protected RangeColors(String jsBase) {
        this.jsBase = jsBase;
    }

    protected RangeColors(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double count;

    public RangeColors setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;
    private SolidFill color;

    public RangeColors setItemAt(Double index, SolidFill color) {
        if (jsBase == null) {
            this.index = index;
            this.color = color;
        } else {
            this.index = index;
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index, ((color != null) ? color.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index, ((color != null) ? color.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private SolidFill[] items;
    private LinearGradientFill items1;
    private RadialGradientFill items2;
    private GradientKey[] items3;
    private String[] items4;
    private SolidFill items5;
    private String items6;
    private SolidFill var_args;
    private String var_args1;

    public RangeColors setItems(SolidFill[] items, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(SolidFill[] items, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(LinearGradientFill items1, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(LinearGradientFill items1, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(RadialGradientFill items2, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(RadialGradientFill items2, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(GradientKey[] items3, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items3 = items3;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(GradientKey[] items3, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items3 = items3;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(String[] items4, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items4 = items4;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(String[] items4, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items4 = items4;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(SolidFill items5, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items5 = items5;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(SolidFill items5, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items5 = items5;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(String items6, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items6 = items6;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public RangeColors setItems(String items6, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items6 = items6;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), wrapQuotes(var_args1)));
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
//            js.append(generateJScount());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJScolor());
////        
//            js.append(generateJSitems());
////        
//            js.append(generateJSitems1());
////        
//            js.append(generateJSitems2());
////        
//            js.append(generateJSitems3());
////        
//            js.append(generateJSitems4());
////        
//            js.append(generateJSitems5());
////        
//            js.append(generateJSitems6());
////        
//            js.append(generateJSvar_args());
////        
//            js.append(generateJSvar_args1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}