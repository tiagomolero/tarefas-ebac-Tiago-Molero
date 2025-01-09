# Expressões Lambda
### DEFINIÇÃO
A expressão lambda é uma forma de definir uma função sem que seja necessário uma declaração dela (função anônima). Ou seja, você cria uma função sem precisar definir o nome dela, um tipo de retorno e o modificador de acesso.
As funções Lambdas tem a sintaxe definida como:

> Vale reforçar que lambdas só podem ser usadas em interfaces funcionais (interfaces com exatamente um método abstrato), como Runnable, Comparator, ou interfaces definidas pelo programador.

```
(argumento) -> (corpo)
```
##### OU

```
(a, b) -> a + b;
```

### EXEMPLO NA PRÁTICA

##### SEM LAMBDA
```
Runnable r = new Runnable() {
     public void run() {
          System.out.println("Thread com classe interna!");
     }
};
new Thread(r).start();
```

##### COM LAMBDA
```
Runnable r = () -> System.out.println("Thread com função lambda!");
new Thread(r).start();
```

### RESUMO
Em conclusão, as expressões lambda são uma ferramenta poderosa para tornar o código Java mais conciso e legível. Além disso, elas permitem criar instâncias de interfaces funcionais de forma simplificada, facilitando o trabalho com coleções e a Stream API. 