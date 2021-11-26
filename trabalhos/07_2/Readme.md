# Sala de Cinema (Vetor de nulos)

![](figura.jpg)

O objetivo dessa atividade é implementar o sistema de alocação de uma única sala de cinema. Se existem cadeiras livres, os clientes podem reservá-las. Também podem desistir da reserva. O sistema deve mostrar quem está sentado em cada cadeira.

Nessa atividade, você deverá criar:

1. Uma classe que representa o cliente.
2. Uma classe que representa a sala de cinema e guarda os clientes.
3. Uma classe que controle o fluxo de entrada e saída e processe as chamadas.

## Requisitos
Seu sistema deverá:

- **[3.0 P] Inicializando.** 
    - Iniciar a sala de cinema. 
        - Ao iniciar, você deve informar quantos assentos existem na sua sala.
    - Mostrar o estado da sala, escrevendo um - para cada cadeira vazia.
    - Se uma nova sala for iniciada, apague todas as informações da sala antiga.
- **[4.0 P] Reservas.** 
    - reservar uma cadeira para um cliente passando id, telefone e número da cadeira.
        - avise que houve erro ao tentar colocar duas pessoas na mesma cadeira.
        - avise que houve erro ao tentar colocar duas pessoas com mesmo id na sala.
        - atualize a função show para mostrar os clientes onde estiverem sentados.
- **[3.0 P] Cancelamentos.** 
    - Cancele reserva passando o id do cliente.

***

## Shell

```bash
#__case inicializar

$show
[ ]
$init 5
$show
[ - - - - - ]
$init 4
$show
[ - - - - ]

#__case reservas

$reservar davi 3232 0
$reservar joao 3131 3
$show
[ davi:3232 - - joao:3131 ]
$reservar rute 3030 0
fail: cadeira ja esta ocupada
$reservar davi 3234 2
fail: cliente ja esta no cinema

#__case cancelamentos

$cancelar davi
$show
[ - - - joao:3131 ]
$cancelar rita
fail: cliente nao esta no cinema
$show
[ - - - joao:3131 ]
$end
#__end__
```
***
## Diagrama
![](diagrama.png)


## Esqueleto
<!--FILTER Solver.java java-->
```java
class Client {
    private String id;
    private String fone;
    public Client(String id, String fone);
    public String toString();
    String getId();
    void setId(String id);
    String getFone();
    void setFone(String fone);
}
class Sala{
    private ArrayList<Client> cadeiras;
    ArrayList<Client> getCadeiras();
    public Sala(int capacidade);
    public boolean reservar(String id, String fone, int ind);
    public void cancelar(String id);
    public String toString();
}
class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala(0);
        while(true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("init")) {
                sala = new Sala(Integer.parseInt(ui[1]));
            } else if(ui[0].equals("show")) {
                System.out.println(sala);
            } else if(ui[0].equals("reservar")) {
                sala.reservar(ui[1], ui[2], Integer.parseInt(ui[3]));
            } else if(ui[0].equals("cancelar")) {
                sala.cancelar(ui[1]);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}

class Manual {
    public static void main(String[] args) {
        Sala cinema = new Sala(0);
        System.out.println(cinema);
        // [ ]
        cinema = new Sala(5);
        System.out.println(cinema);
        // [ - - - - - ]
        cinema = new Sala(4);
        System.out.println(cinema);
        // [ - - - - ]
        cinema.reservar("davi", "3232", 0);
        cinema.reservar("joao", "3131", 3);
        System.out.println(cinema);
        // [ davi:3232 - - joao:3131 ]
        cinema.reservar("rute", "3030", 0);
        // fail: cadeira ja esta ocupada
        cinema.reservar("davi", "3234", 2);
        // fail: cliente ja esta no cinema
        cinema.cancelar("davi");
        System.out.println(cinema);
        // [ - - - joao:3131 ]
        cinema.cancelar("rita");
        // fail: cliente nao esta no cinema
        System.out.println(cinema);
        // [ - - - joao:3131 ]
    }
}
```
<!--FILTER_END-->














