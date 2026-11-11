# Moto

## OBBLIGATORIO

Creare un programma da terminale che da una lista (fai 4 versioni della stessa lista, una: creata a manina estendendo List dando un'interfaccia generica per le 2 liste, una invece con il sistema Nodo-Next, una doppiamente concatenata e una classica. Tutte devono poter essere iterate quindi devi usare l'interfaccia Iterable/l'altra) di veicoli (moto, auto) ti permetta di fare certe operazioni, ogni veicolo ha certe caratteristiche, creare una sorta di "API" per registrare un veicolo. Un'operazione che permetta di calcolare un punteggio che determini quanto effettivamente conviene qualità-prezzo, un punteggio che riguarda quanto forte va in confronto al peso. Queste operazioni sono passate tramite una lambda in un metodo **Function** (O un'altra interfaccia **SAM** come **Supplier**, **Consumer**). Ci deve essere un'operazione che ordini prima tutte le macchine e poi tutte le moto in ordine alfabetico. Ci deve essere un'operazione di confronto tra 2 veicoli (quindi **Comparable**). Cercare di utilizzare gli elementi forniti dalle dispense. Creare anche una lista della spesa (Stack) potendo aggiungere un veicolo a questa lista e facendo ulteriori operazioni su codesta (magari aggiungendo proprio un oggetto apparte contentente solo le informazioni necessarie quindi usare il metodo `.map`)

- Va organizzato in package
- Veicolo deve essere generico e deve avere nome, marca, peso, costo, potenza in CV, anno d'uscita
- classe wrapper attorno a veicolo che dice lo stato che dice quanti chilometri ha, che componenti sono consumati e che hanno è stata presa
- Se riesci fai delle classi record (ti viene consigliato anche dall'IDE)
- Ogni classe deve essere il più ordinata possibile

## OPZIONALE

- Crei sul flow di test dei test effettivi per testare il programma tramite dei metodi del progetto