### Injeção de Dependência

É um padrão de design utilizado para diminuir o acoplamento entre objetos ou classes. Ao invés da dependência ser criada dentro da classe, ela criada fora e "injetada" no objeta Casa, já pronta.
Por exemplo a classe Casa depende de uma classe SistemaElétrico para funcionar. Em vez de a Casa criar o SistemaElétrico internamente (o que aumentaria o acoplamento), ela recebe o SistemaElétrico já pronto, seja através de um construtor ou de um método de configuração.