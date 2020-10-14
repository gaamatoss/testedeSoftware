## Testes Funcionais

Intervalo de valores de testes entre 1 a 99.

### Link para o vídeo no youtube:
[Video](https://www.youtube.com/watch?v=euxrhNs8hjY)

## Testes
Para realizar os testes é necessário ter o java 8+ e o gradle 5+ instalado em sua máquina e em seguida entrar em cada commit com os testes [RED](https://github.com/gaamatoss/testedeSoftware/commit/2e1fdf7cf934e7216f4f64e1a433bc2fd060e395),[GREEN](https://github.com/gaamatoss/testedeSoftware/commit/8f3703b5a96991f6f4bc8e6c7d551078c6d04e81),[BLUE](https://github.com/gaamatoss/testedeSoftware/commit/4ada392e5561f14473d4664c1bd82875032a7846) e copiar o id do commit e executar o comando:

...
git checkout "id-commit"
...

em seguida realizar o teste:

...
gradle test --info
...

repetir esse processo em cada commit, no fim rodar o projeto no commit Blue:

...
gradle run
...

FIM!