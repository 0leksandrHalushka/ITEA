package lesson9;

public class Europe {
    private String country;
    private History history;

    private class History{
        private String territoryChanges;

        private String changes (String territory, String change){
           switch (change){
               case "+": return territoryChanges = "has annexed territories " + territory;
               case "-": return territoryChanges = "lost territories " + territory;
               default: return territoryChanges = "wrong operation";
           }

        }

    }

    public void run (String country, String territory, String changes){
        history = new History();
        this.country = country;
        history.changes(territory, changes);

    }

    @Override
    public String toString() {
        return "Europe{" +
                "country: '" + country + '\'' +
                ", territory changes: " + history.territoryChanges +
                '}';
    }
}

