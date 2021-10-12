# RepositoryProgrammazioneAdOggetti

# Per importare il progetto in Eclipse:
 1. Innanzitutto dobbiamo clonare il progetto nel pc. Cliccare quindi su Code > Open with GitHubDesktop
 2. Una volta aperto, GitHubDesktop chiederà la cartella in cui salvare il progetto. Scegliere una cartella che NON sia nel workspace di Eclipse o crearne una VUOTA.
 3. Dopo aver aperto Eclipse andare su File > Import e selezionare "Git"/"Project from Git" e poi cliccare su Next.
 4. Dato che abbiamo già clonato la repository nel computer basterà importarla in Ecplise cliccando su "Existing local repository". Cliccare su Next.
 Se nell'elenco seguente non compare la cartella che abbiamo clonato al punto 2, selezionarla cliccando su Add > Browse. Cliccare su Add per aggiungere la Repository all'elenco.
 Selezionare dall'elenco la cartella appena aggiunta e cliccare su Next e poi Finish.
 Il progetto dovrebbe comparire nel Project Explorer

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# COME USARE GIT

# COMMIT E PUSH
 I commit non sono altro che una versione del progetto a cui stiamo lavorando. Un commit da solo non basta a modificare il progetto su git, poichè il commit è una versione LOCALE 
 del progetto. Per rendere effettive le modifiche contenute nel commit occorre eseguire un "PUSH" del commit.
 
 Come si esegue un commit in Eclipse? Dopo aver eseguito una qualsiasi modifica al progetto, cliccare con il tasto destro sulla cartella del progetto su cui si vuole eseguire un commit
 e selezionare Team > Commit. Nel tab Git Staging aperto automaticamente in basso, bisogna trascinare i file modificati che
 compaiono nell'elenco "Unstaged Changes" nel riquadro "Stage Changed". In questo modo abbiamo aggiunto i file modificati al commit. Dopo aver scritto una breve descrizione di ciò che
 si è modificato, basterà cliccare su "Commit and Push" in basso a destra. In  questo modo i file modificati verranno aggiunti alla Repository di Git ed entreranno a far parte 
 dello storico del progetto. Nel caso in cui "Commit and Push" non dovesse funzionare, cliccare solo su "Commit", aprire GitHubDesktop e fare il push da lì. In effetti le 
 operazioni di commit, push, pull, ecc.. possono essere fatte sia all'interno di Eclipse, che in GitHubDesktop indistintamente. 
 NOTA BENE: prima di eseguire un push del proprio lavoro è sempre bene controllare se si disponga dell'ultima versione del progetto. Per controllare ciò è sufficiente 
 eseguire un PULL(vedi sotto).

# MASTER E BRANCHES
 La prima volta che si esegue un commit, si origina anche il "ramo principale" del progetto, il cosiddetto "master". Questo serve perché è possibile creare più "rami", detti "branches"
 nel caso in cui si vogliano creare differenti versioni alternative dello stesso progetto. 

# PULL
 Quando viene eseguito un commit e poi un push da parte di un utente, tutti gli utenti che vogliono avere accesso alle modifiche effettuate
 devono eseguire un altro comando, detto "PULL", il quale non fa altro che scaricare le modifiche nella propria copia locale.
 
 Come si esegue un Pull?
 Il modo più semplice per eseguire un pull è da GitHubDesktop. Infatti appena saranno rilevate delle modifiche( aggiornare la pagina cliccando su "fetch origin" ), comparirà un pulsante con scritto "Pull origin". Cliccando lì le modifiche verranno scaricate. 

# MERGE

# REBASE

