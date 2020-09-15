# Teste De Software
Repositório criado para a disciplina de Teste de Software

### Gabriel Matos Marques Silva
#### RA: 1460481721027

### Entrega Introdução [Video Explicativos](https://www.youtube.com/watch?v=gAqPSGpchAc&feature=youtu.be)
Para o primeira projeto estudamos sobre TDD(Test Driven Development) onde existem 3 etapas:

- [TDD-RED](https://github.com/gaamatoss/testedeSoftware/tree/TDD-Red)
O TDD-Red serve para escrevermos o teste que inicialmente não passa.

- [TDD-GREEN](https://github.com/gaamatoss/testedeSoftware/tree/TDD-Green)
Adicionamos uma nova funcionalidade e fazemos o teste passar.

- [TDD-BLUE](https://github.com/gaamatoss/testedeSoftware/tree/TDD-Blue)
Refatoramos todo o código e escrevemos o último teste.

##### Projeto
Escolhi como tema para realizar os testes os calculos de uma area quadrada e area cúbica.

###### Observações
Para rodar os testes é necessário a instalação do gradle v5+ e Java. 

### Rodando os testes

Inicialmente iremos clonar o repositório
```
git clone https://github.com/gaamatoss/testedeSoftware.git
```

Em seguida alteramos para a branch de TDD-RED:
```
git checkout "TDD-Red"
```

Em seguida entramos na pasta "entrega_introducao" e utilizamos o comando do gradle para realizar o primeiro teste:
```
gradle test --info
```
O teste irá falhar!!

Após mudamos para a branch TDD-Green:
```
git checkout "TDD-Green"
```

Entramos novamente na pasta "entrega introdução" e utilizamos o mesmo comando para executar o teste
```
gradle test --info
```

E por fim entraremos podemos retornar para a master ou entrar na branch TDD-Blue e rodarmos a aplicação tendo a interação com o usuário. 
```
git checkout "TDD-Blue"
```

E damos o comando:
```
gradle run
``` 
Todos os testes geram um report em HTML que pode ser encontrado dentro da pasta >entrega_introducao\build\reports\index.html.
