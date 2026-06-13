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
/*
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
*/
public class Day7Interface {

    interface Employee {
        void solveProblem();
        void work();
    }

    static class BankEmployee implements Employee{
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is solving banking problems");
        }

        @Override
        public void work() {
            System.out.println(name + " is working in the bank");
        }
    }

    static class CheckingEmployee implements Employee {

        String name;
        String id;
        int salary;

        CheckingEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is checking customer accounts");
        }

        @Override
        public void work() {
            System.out.println(name + " is performing checking operations");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new BankEmployee("subasree sj", "B101", 50000);
        Employee emp2 = new CheckingEmployee("joseph", "C102", 45000);
        System.out.println("--------------------------------");
        emp1.work();
        System.out.println();
        emp1.solveProblem();
        System.out.println("--------------------------------");
        emp2.work();
        System.out.println();
        emp2.solveProblem();
        System.out.println("--------------------------------");

    }
}




