package gitStart;

public class Info {
	//1) Заходим в папку work spais
	//2) git init (создаем папку  .git)
	//3) git status
	//On branch master (всегда следим в каком мы брэнче)
	// No commits yet (еще нет коммитов, нечего пушить в git)
	// Untracked files (не проанолизированные коммиты, не отслеживаемые) - далее git add .
	//4) git add <file> - добавить в коммит
	//   git rm --cached <file> - изьять 
	//5) git add . (команда которая помещает в стайдж все красные папки и файлы)
	//6) git status (проверяем что все файлы добавлены)
	//7) создаем внутри проекта файл .gitignore - обязательно (исключает файлы)
	//	- .project
	// - bin
	//8) опять git add . - что бы добавить файл .gitignore
	// (те файлы и папки которые уже были добавлены необходимо сначала изьятьБ и только 
	// после этого исключать)
	//9) git rm --cached -r bin (удаляем папку из cash (on track)
	// 10) git commit -m "initial commit" (все что в кэше коментируем и все это идет в брэнч мастер)
	// 11) git config --global -e (проверка)- делать не нужно все собьется
	//12) git config --global user
	//		git config --global user.name Artem Shumko
	//		git config --global user.email artemshumko87@gmail.com
	//13) git commit -m "extra games"(
	//14) git status (проверяем что все закоментировано)
	// и только теперь
	// 15) git branch (new) (создаем новую ветку)
	// 16) gin branch (Необходимо узнать в каком мы бранче (если веток две и более)
	// 17) git checkout new1 (переходим в другой брэнч)
	// 18) gin branch (Необходимо узнать в каком мы бранче (если веток две и более)
	// 19) заходим в Git Hub и нажимаем NEW Your repository
	// 20) Создаем новый репозиторий
	// 21) Воодим имя
	// 22) git remote add origin https://github.com/ShumkoArtem/GamesOdnorukii.git
	// Вставляем ссылку с git hub
	// 23) git push -u origin master (пушим)
	
	// Если меняем проект или что-то в проекте
	// 1) git status
	// 2) git add .
	// 3) git commit -m "какоето новое имя"
	// 4) git push -u origin master (пушим)
}
