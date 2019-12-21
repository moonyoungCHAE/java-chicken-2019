package view;

import domain.Menu;
import domain.ProgramCategory;
import domain.Table;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";

    public static void printProgramCategory() {
        System.out.println("##메인화면");
        List<String> programCategory = ProgramCategory.getProgramCategory();
        for (int i = 0; i < programCategory.size(); i++) {
            System.out.println((i + 1) + "-" + programCategory.get(i));
        }
    }

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printLine(BOTTOM_LINE, size);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printFinalPrice(int finalPrice) {
        System.out.println("최종 결제할 금액");
        System.out.println(finalPrice + "원");
    }

    public static void printDiscountInfo(int chickenDiscount, int cashDiscount) {
        System.out.println("치킨 할인: "+chickenDiscount+"원, 현금 할인: "+cashDiscount+"원이 적용된 금액입니다.\n");
    }

    public static void printOrderedMenuInfo(){
        System.out.println("## 주문 내역");
        System.out.println("메뉴 수량 금액");
    }

    public static void printOrderedMenu(Menu menu, int count) {
        System.out.println(menu.getName() + " " + count + " " + menu.getPrice() * count);
    }
}
