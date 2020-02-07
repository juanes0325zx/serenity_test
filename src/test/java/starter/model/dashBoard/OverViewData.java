package starter.model.dashBoard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.model.dashBoard.dashboard;

public class OverViewData {

    public static Question<String> credit_avaliable(){
        return actor -> TextContent.of (dashboard.CREDIT_AVALIABLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> total_balance(){
        return actor -> TextContent.of (dashboard.TOTAL_BALANCE).viewedBy(actor).asString().trim();
    }

    public static Question<String> due_today(){
        return actor -> TextContent.of (dashboard.DUE_TODAY).viewedBy(actor).asString().trim();
    }

    ////table
    public static Question<String> table_row_1_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_1_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_1_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_1_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_1_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_1_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_1_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_1_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_1_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_1_CELL_5).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_2_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_2_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_2_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_2_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_2_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_2_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_2_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_2_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_2_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_2_CELL_5).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_3_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_3_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_3_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_3_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_3_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_3_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_3_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_3_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_3_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_3_CELL_5).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_4_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_4_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_4_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_4_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_4_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_4_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_4_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_4_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_4_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_4_CELL_5).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_5_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_5_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_5_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_5_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_5_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_5_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_5_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_5_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_5_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_5_CELL_5).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_6_cell_1(){
        return actor -> TextContent.of (dashboard.TableRow_6_CELL_1).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_6_cell_2(){
        return actor -> TextContent.of (dashboard.TableRow_6_CELL_2).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_6_cell_3(){
        return actor -> TextContent.of (dashboard.TableRow_6_CELL_3).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_6_cell_4(){
        return actor -> TextContent.of (dashboard.TableRow_6_CELL_4).viewedBy(actor).asString().trim();
    }
    public static Question<String> table_row_6_cell1_5(){
        return actor -> TextContent.of (dashboard.TableRow_6_CELL_5).viewedBy(actor).asString().trim();
    }
}
