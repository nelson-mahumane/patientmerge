# patientmerge
O Algoritmo deste sistema de merge de dados de pacientes duplicados funciona de seguinte maneira:
1- agrupa os atributos em um objecto do tipo patient;
2-tem duas funcionalidade de criar o golden Id sendo que um é par um paciente especifico e o outro é para uma lista geral de pacientes existente na base de dados.
3- possui um mecanismo que valia as probavilidades:
  a- se tem 6 semelhancas prob=100%
  b)5 prob=80%
  c) 4 prob=70%
  d) 3 prob=50%
  e) 2 prob=30%
  f) 1 prob=10%

  4- o criterio para o GoldenID os paciente devem ter semelhanacas acima nos atributos acima de 50%

  o codigo representa os algoritmos
