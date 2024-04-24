    public class Main {
    public static void main(String[] args)

    private String nome;
    private int anoNascimento;
    private String amiga;
    private boolean cantando;


    public Main(String nome, int anoNascimento, String Clara) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.amiga= Clara;
        this.cantando = false;
    }


    public void cantar() {
        if (!cantando) {
            System.out.println(nome + " está cantando!");
            cantando = true;
        } else {
            System.out.println(nome + " já está cantando.");
        }
    }

    public void pararDeCantar() {
        if (cantando) {
            System.out.println(nome + " parou de cantar.");
            cantando = false;
        } else {
            System.out.println(nome + " não estava cantando.");
        }
    }

    public void apresentar() {
        System.out.println("Olá, eu sou " + nome + " (apelido: " + amiga + ") e nasci em " + anoNascimento + ".");
    }

    // Outros métodos podem ser adicionados conforme necessário

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getAmiga() {
        return amiga;
    }

    public void setAmiga(String Clara) {
        this.amiga = Clara;
    }
    }
