# List-generator
Application created in Java with the goal of improving knowledge in the language. This application can generate up to 4 types of lists in your workspace. Your options are: task list, shopping list, expense list, and event list.

---------------------------
ListApp - Programa principal, onde contém o menu inicial. Com variaveis opções de listas para selecionar.


----------------------------
ListC - Interface da lista de compras, solicita que o usuario digite o item desejado e sua categoria (ambos obrigatórios). A lista será nomeada como "lista_compras" em formato txt no desktop do usuário. Possui três diferentes botões:
'Adicionar Item' - adiciona o item digitado pelo usuario na sua lista de compras;
'Visualizar Lista' - mostra uma pré-visualização dos itens que foram adicionados na lista;
'Gerar Lista' - gera a lista final, com todos os itens que foram adicionados pelo usuário em suas determinadas categorias. Se um arquivo com o mesmo nome já existir, aparecerá uma mensagem no visor do usuário avisando que, o arquivo já e existe e foi substituido pelo novo.


--------------------------
ListaT - Interface da lista de tarefas, solicita o nome da tarefa e seu status, podendo ser 'Pendente' ou 'Concluída' (campos obrigatórios). A lista será criada como "lista_tarefas.txt" no desktop do usuário. Tem a presença de 5 tipos de botões diferentes:
'Adicionar Tarefa' - adiciona a atual tarefa digitada pelo usuario;
'Exibir Tarefas' - mostra ao usuario todas as tarefas que já foram adicionadas na lista;
'Alterar Status' - faz a alteração do status das tarefas que o usuario deseja mudar;
'Excluir Tarefa' - mostra as tarefas adicionadas e suas posições, solicitando que o usuario informe a posição da tarefa que deseja excluir;
'Gerar Lista' - cria a lista com as tarefas inseridas pelo usuario, contendo o nome e status da tarefa conforme inseridos. Se a lista já existir, os novos dados serão inseridos no arquivo existente.


--------------------------
ListE - Interface gráfica para criar a lista de eventos nomeada como "ListaEventos" em formato txt, possui 4 campos obrigatórios onde o usuário deve inserir o nome do evento, local, data e a hora. Possui 2 botões de funcionalidade:
'Adicionar Evento' - adiciona o evento inserido nos campos pelo usuario;
'Gerar Lista' - cria a lista com todos os eventos adicionados pelo usuario. Se um arquivo do mesmo tipo e nome já existir, os eventos recém adicionados serão inseridos no arquivo existente, mantendo os dados antigos.


-----------------------------
ListG - interface para gerar uma lista em formato csv dos gastos inseridos pelo usuario, o arquivo será salvo como "gastos" no desktop atual. Possui 3 campos obrigatórios, Item: onde o usuario vai inserir o tipo de item desejado. Valor: o valor gasto pelo usuário naquele item. Categoria: a categoria que o item faz parte. Além desses 3 campos, também existe o campo Data: onde o usuário poderá informar a data em que comprou ou pagou por aquele item, mas ao contrário dos outros, esse campo é opcional. Nessa interface existe a presença de apenas um botão:
'Adicionar Item' - ao clicar a lista sera criada automaticamente junto com o item inserido. Cada vez que o botão é pressionado, o item atual sera adicionado na lista em formato CSV.






____________________________________________________       
*  Esse programa ainda está sendo modificado,        
*  algumas alterações e melhorias são necessárias.  
____________________________________________________


