### 1. e 2.
A classe "RelatorioAluno" violava o SRP por que tinha mais de uma responsabilidade, "Classe Deus". Isso dificulta sua manutenção e reduz a coesão
 da classe.

### 3.
A estrutura que era usada em "Matricula" violava o OCP, por que ao criar um novo tipo de desconto você modificava o método "CalcularMensalidade()".
A estrutura condicional também não era boa, por que quando você adiciona mais descontos maior fica e mais dificil de manter.

### 4.
A classe Matricula dependia diretamente da classe "GravadorMySQL" que é concreta, por meio de "new GravadorMySQL()". Isso viola o DIP.
Isso também gerava alto nivel de acoplamento e rigidez, já que se precisasse trocar a persistência teria que modificar a classe "Matricula".  



