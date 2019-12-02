Abduls-MacBook-Air:diklat abdulaziz$ mkdir rhymes
Abduls-MacBook-Air:diklat abdulaziz$ cd rhymes
Abduls-MacBook-Air:rhymes abdulaziz$ git init 
Initialized empty Git repository in /Users/abdulaziz/diklat/rhymes/.git/
Abduls-MacBook-Air:rhymes abdulaziz$ touch README.txt 
Abduls-MacBook-Air:rhymes abdulaziz$ git add README.txt 
Abduls-MacBook-Air:rhymes abdulaziz$ git commit -m 'First commit.' 
[master (root-commit) 4e4022d] First commit.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt
Abduls-MacBook-Air:rhymes abdulaziz$ echo 'This repo is a collection of my favorite nursery rhymes.' >> README.txt
Abduls-MacBook-Air:rhymes abdulaziz$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   README.txt

no changes added to commit (use "git add" and/or "git commit -a")
Abduls-MacBook-Air:rhymes abdulaziz$ git diff
diff --git a/README.txt b/README.txt
index e69de29..c83e022 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursery rhymes.
Abduls-MacBook-Air:rhymes abdulaziz$ git add README.txt
Abduls-MacBook-Air:rhymes abdulaziz$ git commit -m 'Added project overview to README.txt'
[master 2b1718b] Added project overview to README.txt
 1 file changed, 1 insertion(+)
Abduls-MacBook-Air:rhymes abdulaziz$ wget https://raw.githubusercontent.com/lkhl2003/rhymes/master/all-around-the-mulberry-bush.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID.
Warning: Failed to set locale category LC_TIME to en_ID.
Warning: Failed to set locale category LC_COLLATE to en_ID.
Warning: Failed to set locale category LC_MONETARY to en_ID.
Warning: Failed to set locale category LC_MESSAGES to en_ID.
--2019-12-02 22:41:58--  https://raw.githubusercontent.com/lkhl2003/rhymes/master/all-around-the-mulberry-bush.txt
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 151.101.8.133
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|151.101.8.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 439 [text/plain]
Saving to: ‘all-around-the-mulberry-bush.txt’

all-around-the-mulberry-bus 100%[=========================================>]     439  --.-KB/s    in 0s      

2019-12-02 22:42:00 (5.23 MB/s) - ‘all-around-the-mulberry-bush.txt’ saved [439/439]

Abduls-MacBook-Air:rhymes abdulaziz$ git add all-around-the-mulberry-bush.txt
Abduls-MacBook-Air:rhymes abdulaziz$ git status 
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	new file:   all-around-the-mulberry-bush.txt

Abduls-MacBook-Air:rhymes abdulaziz$ git commit -m 'Added all-around-the-mulberry-bush.txt.'
[master 4511b86] Added all-around-the-mulberry-bush.txt.
 1 file changed, 19 insertions(+)
 create mode 100644 all-around-the-mulberry-bush.txt
Abduls-MacBook-Air:rhymes abdulaziz$ git log
commit 4511b86c0628947f27cb921849fec5654ded8959 (HEAD -> master)
Author: yaayyuhalaziz <yaayyuhalaziz@gmail.com>
Date:   Mon Dec 2 22:43:42 2019 +0700

    Added all-around-the-mulberry-bush.txt.

commit 2b1718bab85d0c4d8a0eb8f257dec38bd58b3f59
Author: yaayyuhalaziz <yaayyuhalaziz@gmail.com>
Date:   Mon Dec 2 22:37:36 2019 +0700

    Added project overview to README.txt

commit 4e4022d6ac5c7c3e59e29c772fd93d08193630e7
Author: yaayyuhalaziz <yaayyuhalaziz@gmail.com>
Date:   Mon Dec 2 22:36:38 2019 +0700

    First commit.
Abduls-MacBook-Air:rhymes abdulaziz$ git log --oneline
4511b86 (HEAD -> master) Added all-around-the-mulberry-bush.txt.
2b1718b Added project overview to README.txt
4e4022d First commit.
Abduls-MacBook-Air:rhymes abdulaziz$ git log -p
commit 4511b86c0628947f27cb921849fec5654ded8959 (HEAD -> master)
Author: yaayyuhalaziz <yaayyuhalaziz@gmail.com>
Date:   Mon Dec 2 22:43:42 2019 +0700

    Added all-around-the-mulberry-bush.txt.

diff --git a/all-around-the-mulberry-bush.txt b/all-around-the-mulberry-bush.txt
new file mode 100644
index 0000000..b77d989
--- /dev/null
+++ b/all-around-the-mulberry-bush.txt
@@ -0,0 +1,19 @@
+All around the mulberry bush
+The monkey chased the weasel.
+The monkey thought 'twas all in fun.
+Pop! goes the weasel.
+
+A penny for a spool of thread,
+A penny for a needle.
+That's the way the money goes.
+Pop! goes the weasel.
+
+Up and down the City Road,
+In and out of the Eagle,
+That's the way the money goes.
+Pop! goes the weasel.
+
+Half a pound of tuppenney rice,
+Half a pound of treacle,
Abduls-MacBook-Air:rhymes abdulaziz$ git remote add origin https://github.com/yaayyuhalaziz/rhymes.git
Abduls-MacBook-Air:rhymes abdulaziz$ git push -u origin master
remote: Repository not found.
fatal: repository 'https://github.com/yaayyuhalaziz/rhymes.git/' not found
Abduls-MacBook-Air:rhymes abdulaziz$ git push -u origin master
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 4 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (9/9), 998 bytes | 499.00 KiB/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/yaayyuhalaziz/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

