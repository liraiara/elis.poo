public class Main {
    private String nome;
    private int anoNascimento;
    private String amiga;
    private boolean cantando;

    
    public Main(String nome, int anoNascimento, String amiga) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.amiga= amiga;
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
        System.out.println("Olá, eu sou " + nome + " minha amiga é: " + amiga + " e nasci em " + anoNascimento + ".");
    }

    
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

    public void setAmiga(String amiga) {
        this.amiga = amiga;
    }

    // Método main corrigido
    public static void main(String[] args) {
        Main elis = new Main("Elis Regina", 1945, "Clara Nunes");
        elis.apresentar();
        elis.cantar();
        elis.pararDeCantar();
    }
            }
