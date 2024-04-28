abstract class Hewan {
    protected abstract void munculSuara();
}

class Kucing extends Hewan{
    @Override
    protected void munculSuara(){
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }
}

class Burung extends Hewan{
    @Override
    protected void munculSuara(){
        System.out.println("Suara Burung: Cit...cit..cit.");
    }
}


