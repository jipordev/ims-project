package co.cstad.view;

public interface boxBorder {
    static final String TOP_LEFT_CORNER = "┌";
    static final String TOP_RIGHT_CORNER = "┐";
    static final String BOTTOM_LEFT_CORNER = "└";
    static final String BOTTOM_RIGHT_CORNER = "┘";
    static final String HORIZONTAL_BORDER = "─";
    static final String SPACE = " ";
    static final String VERTICAL_BORDER = "│";
//    static final String LEFT_CONNECTOR_BORDER = "╠";
//    static final String RIGHT_CONNECTOR_BORDER = "╣";
//    static final String TOP_CONNECTOR_BORDER = "╦";
//    static final String BOTTOM_CONNECTOR_BORDER = "╩";
//    static final String CROSS_BORDER = "╬";

    // Box Color
    static  final  String reset = "\u001B[0m";
    static final String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String blue = "\u001B[34m";
    String magenta="\u001B[35m";
    static final String cyan = "\u001B[36m";
}