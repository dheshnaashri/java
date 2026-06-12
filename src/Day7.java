/*class Request {
    String name, date, reason;

    Request(String name, String date, String reason) {
        this.name = name;
        this.date = date;
        this.reason = reason;
    }

    void approve() {
        System.out.println("Approved");
    }

    void reject() {
        System.out.println("Rejected");
    }
}

class LeaveRequest extends Request {
    LeaveRequest(String name, String date, String reason) {
        super(name, date, reason);
    }
}

class OnDutyRequest extends Request {
    OnDutyRequest(String name, String date, String reason) {
        super(name, date, reason);
    }
}

public class Day7 {
    public static void main(String[] args) {

        LeaveRequest l = new LeaveRequest("Subasree SJ", "12-06-2026", "Sick Leave");
        System.out.println(l.name + " " + l.date + " " + l.reason);
        l.approve();

        OnDutyRequest o = new OnDutyRequest("Joseph", "13-06-2026", "Workshop");
        System.out.println(o.name + " " + o.date + " " + o.reason);
        o.reject();
    }
}
*/

class Payment {
void transfer(int amount) {
    System.out.println("Payment: " + amount);
}
}

class UpiPayment extends Payment {
    void transfer(int amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class CardPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Card Payment: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

public class Day7{
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.transfer(500);

        p = new CardPayment();
        p.transfer(1000);

        p = new NetBankingPayment();
        p.transfer(2000);
    }
}









