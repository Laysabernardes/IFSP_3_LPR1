import java.util.Scanner;

public class Hora {
    Scanner scan = new Scanner(System.in);

    private int hora;
    private int min;
    private int seg;

    public Hora() {
        System.out.print("Digite as horas: ");
        int Hora = scan.nextInt();
        while (Hora < 0 || Hora > 23) {
            System.out.println("Horas inválidas. Por favor, digite novamente.");
            System.out.print("Digite as horas: ");
            Hora = scan.nextInt();
        }
        this.hora = Hora;

        // MINUTOS
        System.out.print("Digite os minutos: ");
        int Min = scan.nextInt();
        while (Min < 0 || Min > 59) {
            System.out.println("Minutos inválidos. Por favor, digite novamente:");
            System.out.print("Digite os minutos: ");
            Min = scan.nextInt();
        }
        this.min = Min;

        // SEGUNDOS
        System.out.print("Digite os segundos: ");
        int Seg = scan.nextInt();
        while (Seg < 0 || Seg > 59) {
            System.out.println("Segundos inválidos. Por favor, digite novamente:");
            System.out.print("Digite os segundos: ");
            Seg = scan.nextInt();
        }
        this.seg = Seg;
    }

    // Construtor da classe Hora que recebe três parâmetros: h (hora), m (minuto) s
    // (segundo)
    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    // Método para definir o valor das horas
    public void setHor(int h) {
        if (h >= 0 && h < 24)
            this.hora = h;
        else
            System.out.println("Valor invalido. O valor das horas deve estar entre 0 e 23.");
    }

    // Método para definir o valor dos minutos
    public void setMin(int m) {
        if (m >= 0 && m < 60)
            this.min = m;
        else
            System.out.println("Valor invalido. O valor dos minutos deve estar entre 0 e 59.");
    }

    // Método para definir o valor dos segundos
    public void setSeg(int s) {
        if (s >= 0 && s < 60)
            this.seg = s;
        else
            System.out.println("Valor invalido. O valor dos segundos deve estar entre 0 e 59.");
    }

    // Método para definir o valor das horas através de entrada do usuário
    public void setHor() {
        System.out.print("Digite as horas: ");
        int horas = scan.nextInt();
        while (horas < 0 || horas > 23) {
            System.out.print("Entrada inválida. Digite novamente");
            System.out.print("Digite as horas: ");
            horas = scan.nextInt();
        }
        this.hora = horas;
        scan.close();
    }

    // Método para definir o valor dos minutos através de entrada do usuário
    public void setMin() {
        System.out.print("Digite os minutos: ");
        int minutos = scan.nextInt();
        while (minutos < 0 || minutos > 59) {
            System.out.print("Valor invalido. Digite novamente");
            System.out.print("Digite os minutos: ");
            minutos = scan.nextInt();
        }
        this.min = minutos;
        scan.close();
    }

    // Método para definir o valor dos segundos através de entrada do usuário
    public void setSeg() {
        System.out.print("Digite os segundos: ");
        int segundos = scan.nextInt();
        while (segundos < 0 || segundos > 59) {
            System.out.print("Valor inválido. Digite novamente");
            System.out.print("Digite os segundos: ");
            segundos = scan.nextInt();
        }
        this.seg = segundos;
        scan.close();
    }

    // Método para obter o valor das horas
    public int getHor() {
        return this.hora;
    }

    // Método para obter o valor dos minutos
    public int getMin() {
        return this.min;
    }

    // Método para obter o valor dos segundos
    public int getSeg() {
        return this.seg;
    }

    // Método para obter a hora no formato HH:MM:SS (24 horas)
    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    // Método para obter a hora no formato HH:MM:SS AM/PM (12 horas)
    public String getHora2() {
        String periodo = (hora < 12) ? "AM" : "PM";
        int hora12 = (hora < 12) ? hora : hora - 12;
        if (hora12 == 0)
            hora12 = 12;
        return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
    }

    // Método para obter o total de segundos desde a meia-noite
    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    public String mostra() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }
}