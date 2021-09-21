## Instruções para criação de migrate
___
    1. O nome do arquivo deve seguir a seguinte ordem e SEM ESPAÇOS:
        a) [V] 
        b) [yyyyMMddHHmm] 
        c) [__] 
        d) [SIGLA DE ATÉ 3 CARACTERES FORMADA PELAS INICIAIS DO NOME DO AUTOR]
        e) [DESCRIÇÃO BREVE COM PALAVRAS SEPARADAS POR UNDERLINE]

    2. A descrição do migrate não deve conter caracteres minúsculos.

    3. Sobe circunstância alguma realizar comandos DML(exceto SELECT) nos migrates.

    4. Para as palavras listadas abaixo e de uso obrigatório as abreviações correspondetes.
        a) CRIAR/CREATE     >>>     CRI
        b) ALTERAR/ALTER    >>>     ALT
        c) DELETAR/DELETE   >>>     DEL
        d) TABELA/TABLE     >>>     TBL
        e) COLUNA/COLUMN    >>>     CLN

    5. Jamais altere o conteúdo de um migrate!! 
---

## Instruções sobre a pasta Older
    Após 60(sessenta) dias de criação os migrates devem ser movidos para pasta Older  
