/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    public enum state{ZERO,ONE,TWO,THREE};
    private state s;

    /**
     * @return the s
     */
    public state getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(state s) {
        this.s = s;
    }
 public void statusDetail(String code)
 {
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
