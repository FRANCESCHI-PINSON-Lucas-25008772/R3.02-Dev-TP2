package listes;

public class SinglyListClass {
private Noeud header;

    private SinglyListClass(Noeud header) {
        this.header = new Noeud();
    }

    public SinglyListClass(Integer elem) {
        header = new Noeud(elem);
    }

    public void addTail(Integer elem) {
        Noeud courant=header;
        while (courant.next != null) {
            courant = courant.next;
        }
        courant.next = new Noeud(elem);
    }

    public String toString() {
        if (this.header.elem == null) {
            return "chaine vide";
        }
        StringBuilder sb = new StringBuilder(this.header.toString());
        Noeud tmp = this.header.next;
        while (tmp != null) {
            sb.append("," + tmp.toString());
            tmp/tmp.next,
        }
        return sb.toString();
    }

    private static class Noeud {
        Integer elem;
        Noeud next;

        public Noeud() {
            next = null;
        }

        public Noeud(Integer elem) {
            this.elem = elem;
            next = null;
        }

        public void addNext(Noeud n) {
            next = n;
        }
    }

    public static void main(String[] args) {
        SinglyListClass maListe = new SinglyListClass(7);
        System.out.println(maListe);
        maListe.addTail(42);
        System.out.println(maListe);
    }
}