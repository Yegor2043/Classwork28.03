package lesson1.japanese.bank;

public class LoanIssuer {
//    кредитный офицер
    private String name;
    private boolean isLazy; // ленивый
    private boolean isKind; // добрый

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toIssue(LoanTaker taker)
    {
        if (isLazy && taker.getYearlyIncome() > 20_000) {
            return true;
        }
        if (!isLazy && isKind && taker.getYearlyIncome() > 25_000 && taker.getAge() < 60) {
            return true;
        }
        if (!isLazy && !isKind && taker.getYearlyIncome() > 28_000 && taker.getAge() < 50) {
            return true;
        }

        return  false;
    }
}
