### Step 1: Alice creates a new project and hosts it on GitHub. ###

Supis-MBP:hari-01 supicore$ mkdir rhymes
Supis-MBP:hari-01 supicore$ cd rhymes
Supis-MBP:rhymes supicore$ git init
Initialized empty Git repository in /Users/supicore/Incubator/praxis/minggu-01/hari-01/rhymes/.git/
Supis-MBP:rhymes supicore$ git remote add origin git@github.com:sup1core/rhymes.git
fatal: not a git repository (or any of the parent directories): .git
Supis-MBP:rhymes supicore$ git init
Initialized empty Git repository in /Users/supicore/Incubator/praxis/minggu-01/hari-01/rhymes/.git/
Supis-MBP:rhymes supicore$ git remote add origin git@github.com:sup1core/rhymes.git
Supis-MBP:rhymes supicore$ touch README.txt
Supis-MBP:rhymes supicore$ git add README.txt
Supis-MBP:rhymes supicore$ git commit -m 'First commit.'
[master (root-commit) d47ea46] First commit.
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 README.txt
Supis-MBP:rhymes supicore$ echo 'This repo is a collection of my favorite nursery rhymes.' >> README.txt
Supis-MBP:rhymes supicore$ git status
On branch master
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git checkout -- <file>..." to discard changes in working directory)

modified:   README.txt

Untracked files:
(use "git add <file>..." to include in what will be committed)

.DS_Store

no changes added to commit (use "git add" and/or "git commit -a")
Supis-MBP:rhymes supicore$ git diff
diff --git a/README.txt b/README.txt
index e69de29..c83e022 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursery rhymes.
Supis-MBP:rhymes supicore$ git add README.txt
Supis-MBP:rhymes supicore$ git commit -m 'Added project overview to README.txt'
[master f4b7e4c] Added project overview to README.txt
1 file changed, 1 insertion(+)
Supis-MBP:rhymes supicore$ wget https://github.com/bryanhirsch/rhymes/blob/master/all-around-the-mulberry-bush.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_TIME to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_COLLATE to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MONETARY to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MESSAGES to en_ID@calendar=iso8601.
--2019-08-19 13:46:02--  https://github.com/bryanhirsch/rhymes/blob/master/all-around-the-mulberry-bush.txt
Resolving github.com (github.com)... 13.250.177.223
Connecting to github.com (github.com)|13.250.177.223|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘all-around-the-mulberry-bush.txt’

all-around-the-mulberry-bush.txt             [   <=>                                                                             ]  69.00K   121KB/s    in 0.6s    

2019-08-19 13:46:03 (121 KB/s) - ‘all-around-the-mulberry-bush.txt’ saved [70658]

Supis-MBP:rhymes supicore$ wget https://github.com/bryanhirsch/rhymes/blob/master/jack-and-jill.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_TIME to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_COLLATE to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MONETARY to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MESSAGES to en_ID@calendar=iso8601.
--2019-08-19 13:47:11--  https://github.com/bryanhirsch/rhymes/blob/master/jack-and-jill.txt
Resolving github.com (github.com)... 52.74.223.119
Connecting to github.com (github.com)|52.74.223.119|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘jack-and-jill.txt’

jack-and-jill.txt                                 [  <=>                                                                                          ]  67.26K   159KB/s    in 0.4s    

2019-08-19 13:47:12 (159 KB/s) - ‘jack-and-jill.txt’ saved [68870]

Supis-MBP:rhymes supicore$ wget https://github.com/bryanhirsch/rhymes/blob/master/old-mother-hubbard.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_TIME to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_COLLATE to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MONETARY to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MESSAGES to en_ID@calendar=iso8601.
--2019-08-19 13:47:23--  https://github.com/bryanhirsch/rhymes/blob/master/old-mother-hubbard.txt
Resolving github.com (github.com)... 52.74.223.119
Connecting to github.com (github.com)|52.74.223.119|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘old-mother-hubbard.txt’

old-mother-hubbard.txt                            [   <=>                                                                                         ]  71.77K   101KB/s    in 0.7s    

2019-08-19 13:47:25 (101 KB/s) - ‘old-mother-hubbard.txt’ saved [73491]

Supis-MBP:rhymes supicore$ wget https://github.com/bryanhirsch/rhymes/blob/master/twinkle-twinkle.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_TIME to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_COLLATE to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MONETARY to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MESSAGES to en_ID@calendar=iso8601.
--2019-08-19 13:48:00--  https://github.com/bryanhirsch/rhymes/blob/master/twinkle-twinkle.txt
Resolving github.com (github.com)... 13.250.177.223
Connecting to github.com (github.com)|13.250.177.223|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘twinkle-twinkle.txt’

twinkle-twinkle.txt                               [  <=>                                                                                          ]  66.28K   188KB/s    in 0.4s    

2019-08-19 13:48:04 (188 KB/s) - ‘twinkle-twinkle.txt’ saved [67871]

Supis-MBP:rhymes supicore$ https://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt
-bash: https://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt: No such file or directory
Supis-MBP:rhymes supicore$ wgethttps://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt
-bash: wgethttps://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt: No such file or directory
Supis-MBP:rhymes supicore$ wget https://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt
Warning: Failed to set locale category LC_NUMERIC to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_TIME to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_COLLATE to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MONETARY to en_ID@calendar=iso8601.
Warning: Failed to set locale category LC_MESSAGES to en_ID@calendar=iso8601.
--2019-08-19 13:48:38--  https://github.com/bryanhirsch/rhymes/blob/master/hokey-pokey.txt
Resolving github.com (github.com)... 13.250.177.223
Connecting to github.com (github.com)|13.250.177.223|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘hokey-pokey.txt’

hokey-pokey.txt                                   [   <=>                                                                                         ]  68.15K   111KB/s    in 0.6s    

2019-08-19 13:48:40 (111 KB/s) - ‘hokey-pokey.txt’ saved [69790]

Supis-MBP:rhymes supicore$ git add all-around-the-mulberry-bush.txt 
Supis-MBP:rhymes supicore$ git status
On branch master
Changes to be committed:
(use "git reset HEAD <file>..." to unstage)

new file:   all-around-the-mulberry-bush.txt

Untracked files:
(use "git add <file>..." to include in what will be committed)

.DS_Store
hokey-pokey.txt
jack-and-jill.txt
old-mother-hubbard.txt
twinkle-twinkle.txt

Supis-MBP:rhymes supicore$ git commit -m 'Added all-around-the-mulberry-bush.txt.'
[master 4dc7955] Added all-around-the-mulberry-bush.txt.
1 file changed, 959 insertions(+)
create mode 100644 all-around-the-mulberry-bush.txt
Supis-MBP:rhymes supicore$ git add jack-and-jill.txt
Supis-MBP:rhymes supicore$ git commit -m 'Added jack-and-jill.txt.'
[master 912b375] Added jack-and-jill.txt.
1 file changed, 928 insertions(+)
create mode 100644 jack-and-jill.txt
Supis-MBP:rhymes supicore$ git add .
Supis-MBP:rhymes supicore$ git commit -m 'Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt'
[master fc8547f] Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
4 files changed, 2870 insertions(+)
create mode 100644 .DS_Store
create mode 100644 hokey-pokey.txt
create mode 100644 old-mother-hubbard.txt
create mode 100644 twinkle-twinkle.txt
Supis-MBP:rhymes supicore$ git log
commit fc8547f4ec48eb532bfd2c2212b34f96ccadcb81 (HEAD -> master)
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:50:56 2019 +0700

Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

commit 912b3759ee62b6f3fa71de8224ee94296ddb024b
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:50:34 2019 +0700

Added jack-and-jill.txt.

commit 4dc79559ff169ef6b875297f903972a4633c6fab
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:49:32 2019 +0700

Added all-around-the-mulberry-bush.txt.

commit f4b7e4ce2ffdca27ccf5fe4f68a9e35be17ed2b5
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:45:01 2019 +0700

Added project overview to README.txt

commit d47ea46943f839bac610eb4cef8f28ed37897be0
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:43:57 2019 +0700

First commit.
Supis-MBP:rhymes supicore$ git log --oneline
fc8547f (HEAD -> master) Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
912b375 Added jack-and-jill.txt.
4dc7955 Added all-around-the-mulberry-bush.txt.
f4b7e4c Added project overview to README.txt
d47ea46 First commit.
Supis-MBP:rhymes supicore$ git log -p
commit fc8547f4ec48eb532bfd2c2212b34f96ccadcb81 (HEAD -> master)
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:50:56 2019 +0700

Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

diff --git a/.DS_Store b/.DS_Store
new file mode 100644
index 0000000..5008ddf
Binary files /dev/null and b/.DS_Store differ
diff --git a/hokey-pokey.txt b/hokey-pokey.txt
new file mode 100644
index 0000000..e4e2681
--- /dev/null
+++ b/hokey-pokey.txt
@@ -0,0 +1,946 @@
+
+
+
+
+
+
+<!DOCTYPE html>
+<html lang="en">
+  <head>
+    <meta charset="utf-8">
+  <link rel="dns-prefetch" href="https://github.githubassets.com">
+  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
+  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">
+
+
+
+  <link crossorigin="anonymous" media="all" integrity="sha512-UDS3MR1FfvqHmqZAs2MWSDCWPwLemVRLqCwld4/zfwH0vhv7I6RYmDnMnNAVQKP1YYvqnccOCH4iOhFaUUyrjw==" rel="stylesheet" href="https://github.githubassets.com/assets/frameworks-2e9090135c22aad5f56c2f72dcba7880.css" />
+  <link crossorigin="anonymous" media="all" integrity="sha512-p4eUPemTc/4dlxCrmhH7lQDBSMyxvSF/8JUgk1+wawzib+okmfn1cNuyiRp9pfB76zPitgclXdaPUJivU2s/aw==" rel="stylesheet" href="https://github.githubassets.com/assets/site-789f905d50a214e0c8606578148aa830.css" />
+    <link crossorigin="anonymous" media="all" integrity="sha512-90+TG+oItanuDKLHcqN5W7pLF3VHSJacMuADCYZ81q5HfnTWwJw+uZO2j7llHDjWjipn18ZbC8w7wotLHp+9xg==" rel="stylesheet" href="https://github.githubassets.com/assets/github-0ccb5358d7b02cb7d9fe7243711560ba.css" />
+    
+    
+    
+    
+
+  <meta name="viewport" content="width=device-width">
+  
+  <title>rhymes/hokey-pokey.txt at master · bryanhirsch/rhymes · GitHub</title>
+    <meta name="description" content="Alice&#39;s repo. (This is an example repo for a how-to blog post about collaboration with Git.) - bryanhirsch/rhymes">
+    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
+  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
+  <meta property="fb:app_id" content="1401488693436528">
+
+    <meta name="twitter:image:src" content="https://avatars3.githubusercontent.com/u/143202?s=400&amp;v=4" /><meta name="twitter:site" content="@github" /><meta name="twitter:card"...skipping...

SUMMARY OF LESS COMMANDS

Commands marked with * may be preceded by a number, N.
Notes in parentheses indicate the behavior if N is given.
A key preceded by a caret indicates the Ctrl key; thus ^K is ctrl-K.

h  H                 Display this help.
q  :q  Q  :Q  ZZ     Exit.
---------------------------------------------------------------------------

MOVING

e  ^E  j  ^N  CR  *  Forward  one line   (or N lines).
y  ^Y  k  ^K  ^P  *  Backward one line   (or N lines).
f  ^F  ^V  SPACE  *  Forward  one window (or N lines).
b  ^B  ESC-v      *  Backward one window (or N lines).
z                 *  Forward  one window (and set window to N).
w                 *  Backward one window (and set window to N).
ESC-SPACE         *  Forward  one window, but don't stop at end-of-file.
d  ^D             *  Forward  one half-window (and set half-window to N).
u  ^U             *  Backward one half-window (and set half-window to N).
ESC-)  RightArrow *  Right one half screen width (or N positions).
ESC-(  LeftArrow  *  Left  one half screen width (or N positions).
ESC-}  ^RightArrow   Right to last column displayed.
ESC-{  ^LeftArrow    Left  to first column.
F                    Forward forever; like "tail -f".
ESC-F                Like F but stop when search pattern is found.
r  ^R  ^L            Repaint screen.
R                    Repaint screen, discarding buffered input.
---------------------------------------------------
Default "window" is the screen height.
Default "half-window" is half of the screen height.
---------------------------------------------------------------------------

SEARCHING

/pattern          *  Search forward for (N-th) matching line.
?pattern          *  Search backward for (N-th) matching line.
n                 *  Repeat previous search (for N-th occurrence).
N                 *  Repeat previous search in reverse direction.
ESC-n             *  Repeat previous search, spanning files.
ESC-N             *  Repeat previous search, reverse dir. & spanning files.
ESC-u                Undo (toggle) search highlighting.
&pattern          *  Display only matching lines
---------------------------------------------------
A search pattern may be preceded by one or more of:
^N or !  Search for NON-matching lines.
^E or *  Search multiple files (pass thru END OF FILE).
^F or @  Start search at FIRST file (for /) or last file (for ?).
^K       Highlight matches, but don't move (KEEP position).
^R       Don't use REGULAR EXPRESSIONS.
---------------------------------------------------------------------------

JUMPING

g  <  ESC-<       *  Go to first line in file (or line N).
G  >  ESC->       *  Go to last line in file (or line N).
p  %              *  Go to beginning of file (or N percent into file).
t                 *  Go to the (N-th) next tag.
T                 *  Go to the (N-th) previous tag.
{  (  [           *  Find close bracket } ) ].
}  )  ]           *  Find open bracket { ( [.
ESC-^F <c1> <c2>  *  Find close bracket <c2>.
ESC-^B <c1> <c2>  *  Find open bracket <c1> 
---------------------------------------------------
Each "find close bracket" command goes forward to the close bracket 
matching the (N-th) open bracket in the top line.
Each "find open bracket" command goes backward to the open bracket 
matching the (N-th) close bracket in the bottom line.

m<letter>            Mark the current position with <letter>.
'<letter>            Go to a previously marked position.
''                   Go to the previous position.
^X^X                 Same as '.
---------------------------------------------------
A mark is any upper-case or lower-case letter.
Certain marks are predefined:
^  means  beginning of the file
$  means  end of the file
---------------------------------------------------------------------------

CHANGING FILES

:e [file]            Examine a new file.
^X^V                 Same as :e.
:n                *  Examine the (N-th) next file from the command line.
:p                *  Examine the (N-th) previous file from the command line.
:x                *  Examine the first (or N-th) file from the command line.
:d                   Delete the current file from the command line list.
=  ^G  :f            Print current file name.
---------------------------------------------------------------------------

MISCELLANEOUS COMMANDS

-<flag>              Toggle a command line option [see OPTIONS below].
--<name>             Toggle a command line option, by name.
_<flag>              Display the setting of a command line option.
__<name>             Display the setting of an option, by name.
+cmd                 Execute the less cmd each time a new file is examined.

!command             Execute the shell command with $SHELL.
|Xcommand            Pipe file between current pos & mark X to shell command.
s file               Save input to a file.
v                    Edit the current file with $VISUAL or $EDITOR.
V                    Print version number of "less".
---------------------------------------------------------------------------

OPTIONS



g  <  ESC-<       *  Go to first line in file (or line N).
G  >  ESC->       *  Go to last line in file (or line N).
p  %              *  Go to beginning of file (or N percent into file).
t                 *  Go to the (N-th) next tag.
T                 *  Go to the (N-th) previous tag.
{  (  [           *  Find close bracket } ) ].
}  )  ]           *  Find open bracket { ( [.
ESC-^F <c1> <c2>  *  Find close bracket <c2>.
ESC-^B <c1> <c2>  *  Find open bracket <c1> 
---------------------------------------------------
Each "find close bracket" command goes forward to the close bracket 
matching the (N-th) open bracket in the top line.
Each "find open bracket" command goes backward to the open bracket 
matching the (N-th) close bracket in the bottom line.

m<letter>            Mark the current position with <letter>.
'<letter>            Go to a previously marked position.
''                   Go to the previous position.
^X^X                 Same as '.
---------------------------------------------------
A mark is any upper-case or lower-case letter.
Certain marks are predefined:
^  means  beginning of the file
$  means  end of the file
---------------------------------------------------------------------------

CHANGING FILES

:e [file]            Examine a new file.
^X^V                 Same as :e.
:n                *  Examine the (N-th) next file from the command line.
:p                *  Examine the (N-th) previous file from the command line.
:x                *  Examine the first (or N-th) file from the command line.
:d                   Delete the current file from the command line list.
=  ^G  :f            Print current file name.
---------------------------------------------------------------------------

MISCELLANEOUS COMMANDS

-<flag>              Toggle a command line option [see OPTIONS below].
--<name>             Toggle a command line option, by name.
_<flag>              Display the setting of a command line option.
__<name>             Display the setting of an option, by name.
+cmd                 Execute the less cmd each time a new file is examined.

!command             Execute the shell command with $SHELL.
|Xcommand            Pipe file between current pos & mark X to shell command.
s file               Save input to a file.
v                    Edit the current file with $VISUAL or $EDITOR.
V                    Print version number of "less".
---------------------------------------------------------------------------

OPTIONS

...skipping...

SUMMARY OF LESS COMMANDS

Commands marked with * may be preceded by a number, N.
Notes in parentheses indicate the behavior if N is given.
A key preceded by a caret indicates the Ctrl key; thus ^K is ctrl-K.

h  H                 Display this help.
q  :q  Q  :Q  ZZ     Exit.
---------------------------------------------------------------------------

MOVING

e  ^E  j  ^N  CR  *  Forward  one line   (or N lines).
y  ^Y  k  ^K  ^P  *  Backward one line   (or N lines).
f  ^F  ^V  SPACE  *  Forward  one window (or N lines).
b  ^B  ESC-v      *  Backward one window (or N lines).
z                 *  Forward  one window (and set window to N).
w                 *  Backward one window (and set window to N).
ESC-SPACE         *  Forward  one window, but don't stop at end-of-file.
d  ^D             *  Forward  one half-window (and set half-window to N).
u  ^U             *  Backward one half-window (and set half-window to N).
ESC-)  RightArrow *  Right one half screen width (or N positions).
ESC-(  LeftArrow  *  Left  one half screen width (or N positions).
ESC-}  ^RightArrow   Right to last column displayed.
ESC-{  ^LeftArrow    Left  to first column.
F                    Forward forever; like "tail -f".
ESC-F                Like F but stop when search pattern is found.
r  ^R  ^L            Repaint screen.
R                    Repaint screen, discarding buffered input.
---------------------------------------------------
Default "window" is the screen height.
Default "half-window" is half of the screen height.
---------------------------------------------------------------------------

SEARCHING

/pattern          *  Search forward for (N-th) matching line.
?pattern          *  Search backward for (N-th) matching line.
n                 *  Repeat previous search (for N-th occurrence).
N                 *  Repeat previous search in reverse direction.
ESC-n             *  Repeat previous search, spanning files.
ESC-N             *  Repeat previous search, reverse dir. & spanning files.
ESC-u                Undo (toggle) search highlighting.
&pattern          *  Display only matching lines
---------------------------------------------------
A search pattern may be preceded by one or more of:
^N or !  Search for NON-matching lines.
^E or *  Search multiple files (pass thru END OF FILE).
^F or @  Start search at FIRST file (for /) or last file (for ?).
^K       Highlight matches, but don't move (KEEP position).
^R       Don't use REGULAR EXPRESSIONS.
---------------------------------------------------------------------------

JUMPING

g  <  ESC-<       *  Go to first line in file (or line N).
...skipping...

Commands marked with * may be preceded by a number, N.
Notes in parentheses indicate the behavior if N is given.
A key preceded by a caret indicates the Ctrl key; thus ^K is ctrl-K.

h  H                 Display this help.
q  :q  Q  :Q  ZZ     Exit.
---------------------------------------------------------------------------

MOVING

e  ^E  j  ^N  CR  *  Forward  one line   (or N lines).
y  ^Y  k  ^K  ^P  *  Backward one line   (or N lines).
f  ^F  ^V  SPACE  *  Forward  one window (or N lines).
b  ^B  ESC-v      *  Backward one window (or N lines).
z                 *  Forward  one window (and set window to N).
w                 *  Backward one window (and set window to N).
ESC-SPACE         *  Forward  one window, but don't stop at end-of-file.
d  ^D             *  Forward  one half-window (and set half-window to N).
u  ^U             *  Backward one half-window (and set half-window to N).
ESC-)  RightArrow *  Right one half screen width (or N positions).
ESC-(  LeftArrow  *  Left  one half screen width (or N positions).
ESC-}  ^RightArrow   Right to last column displayed.
ESC-{  ^LeftArrow    Left  to first column.
F                    Forward forever; like "tail -f".
ESC-F                Like F but stop when search pattern is found.
r  ^R  ^L            Repaint screen.
R                    Repaint screen, discarding buffered input.
---------------------------------------------------
Default "window" is the screen height.
Default "half-window" is half of the screen height.
---------------------------------------------------------------------------

SEARCHING

/pattern          *  Search forward for (N-th) matching line.
?pattern          *  Search backward for (N-th) matching line.
n                 *  Repeat previous search (for N-th occurrence).
N                 *  Repeat previous search in reverse direction.
ESC-n             *  Repeat previous search, spanning files.
ESC-N             *  Repeat previous search, reverse dir. & spanning files.
ESC-u                Undo (toggle) search highlighting.
&pattern          *  Display only matching lines
---------------------------------------------------
A search pattern may be preceded by one or more of:
^N or !  Search for NON-matching lines.
^E or *  Search multiple files (pass thru END OF FILE).
^F or @  Start search at FIRST file (for /) or last file (for ?).
^K       Highlight matches, but don't move (KEEP position).
^R       Don't use REGULAR EXPRESSIONS.
---------------------------------------------------------------------------

JUMPING

g  <  ESC-<       *  Go to first line in file (or line N).
G  >  ESC->       *  Go to last line in file (or line N).
p  %              *  Go to beginning of file (or N percent into file).
t                 *  Go to the (N-th) next tag.
T                 *  Go to the (N-th) previous tag.
HELP -- Press RETURN for more, or q when done...skipping...
Author: Supi Core <supi.core@gmail.com>
Date:   Mon Aug 19 13:50:56 2019 +0700

Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

diff --git a/.DS_Store b/.DS_Store
new file mode 100644
index 0000000..5008ddf
Binary files /dev/null and b/.DS_Store differ
diff --git a/hokey-pokey.txt b/hokey-pokey.txt
new file mode 100644
index 0000000..e4e2681
--- /dev/null
+++ b/hokey-pokey.txt
@@ -0,0 +1,946 @@
+
+
+
+
+
+
+<!DOCTYPE html>
+<html lang="en">
+  <head>
+    <meta charset="utf-8">
+  <link rel="dns-prefetch" href="https://github.githubassets.com">
+  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
+  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
+  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">
+
+
+
+  <link crossorigin="anonymous" media="all" integrity="sha512-UDS3MR1FfvqHmqZAs2MWSDCWPwLemVRLqCwld4/zfwH0vhv7I6RYmDnMnNAVQKP1YYvqnccOCH4iOhFaUUyrjw==" rel="stylesheet" href="https://github.githubassets.com/assets/frameworks-2e9090135c22aad5f56c2f72dcba7880.css" />
+  <link crossorigin="anonymous" media="all" integrity="sha512-p4eUPemTc/4dlxCrmhH7lQDBSMyxvSF/8JUgk1+wawzib+okmfn1cNuyiRp9pfB76zPitgclXdaPUJivU2s/aw==" rel="stylesheet" href="https://github.githubassets.com/assets/site-789f905d50a214e0c8606578148aa830.css" />
+    <link crossorigin="anonymous" media="all" integrity="sha512-90+TG+oItanuDKLHcqN5W7pLF3VHSJacMuADCYZ81q5HfnTWwJw+uZO2j7llHDjWjipn18ZbC8w7wotLHp+9xg==" rel="stylesheet" href="https://github.githubassets.com/assets/github-0ccb5358d7b02cb7d9fe7243711560ba.css" />
+    
+    
+    
+    
+
+  <meta name="viewport" content="width=device-width">
+  
+  <title>rhymes/hokey-pokey.txt at master · bryanhirsch/rhymes · GitHub</title>
+    <meta name="description" content="Alice&#39;s repo. (This is an example repo for a how-to blog post about collaboration with Git.) - bryanhirsch/rhymes">
+    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
+  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
+  <meta property="fb:app_id" content="1401488693436528">
+
+    <meta name="twitter:image:src" content="https://avatars3.githubusercontent.com/u/143202?s=400&amp;v=4" /><meta name="twitter:site" content="@github" /><meta name="twitter:card"Supis-MBP:rhymes supicore$ git push -u origin master
Counting objects: 18, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (15/15), done.
Writing objects: 100% (18/18), 21.69 KiB | 1.97 MiB/s, done.
Total 18 (delta 6), reused 0 (delta 0)
remote: Resolving deltas: 100% (6/6), done.
To github.com:sup1core/rhymes.git
* [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.


### Step 2: Bob copies Alice's project, then submits some simple changes ###

supicore@supicore1:~/Documents/git$ git clone https://github.com/sup1core/rhymes.git
Cloning into 'rhymes'...
remote: Enumerating objects: 18, done.
remote: Counting objects: 100% (18/18), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 18 (delta 6), reused 18 (delta 6), pack-reused 0
Unpacking objects: 100% (18/18), done.
supicore@supicore1:~/Documents/git$ ls
rhymes
supicore@supicore1:~/Documents/git$ cd rhymes/
supicore@supicore1:~/Documents/git/rhymes$ git checkout -b hickory-dickory
Switched to a new branch 'hickory-dickory'
supicore@supicore1:~/Documents/git/rhymes$ wget #!/bin/bash
wget: missing URL
Usage: wget [OPTION]... [URL]...

Try `wget --help' for more options.
supicore@supicore1:~/Documents/git/rhymes$ echo "Wait command" &
[1] 3732
supicore@supicore1:~/Documents/git/rhymes$ process_id=$!
supicore@supicore1:~/Documents/git/rhymes$ wait $process_id
Wait command
[1]+  Done                    echo "Wait command"
supicore@supicore1:~/Documents/git/rhymes$ wget https://github.com/bryanhirsch/rhymes/blob/master/hickory-dickory-dock.txt
--2019-08-19 11:57:10--  https://github.com/bryanhirsch/rhymes/blob/master/hickory-dickory-dock.txt
Resolving github.com (github.com)... 13.229.188.59
Connecting to github.com (github.com)|13.229.188.59|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘hickory-dickory-dock.txt’

hickory-dickory-doc     [    <=>             ]  66.07K  58.3KB/s    in 1.1s    

2019-08-19 11:57:15 (58.3 KB/s) - ‘hickory-dickory-dock.txt’ saved [67652]

supicore@supicore1:~/Documents/git/rhymes$ git add hickory-dickory-dock.txt
supicore@supicore1:~/Documents/git/rhymes$ git commit -m "Added hickory-dickory-dock.txt"
[hickory-dickory c7bb085] Added hickory-dickory-dock.txt
Committer: supicore <supicore@supicore1.localdomain>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

git config --global --edit

After doing this, you may fix the identity used for this commit with:

git commit --amend --reset-author

1 file changed, 900 insertions(+)
create mode 100644 hickory-dickory-dock.txt
supicore@supicore1:~/Documents/git/rhymes$ git push origin hickory-dickory
Username for 'https://github.com': supi.slave@gmail.com
Password for 'https://supi.slave@gmail.com@github.com': 
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/sup1core/rhymes.git/'
supicore@supicore1:~/Documents/git/rhymes$ git status
On branch hickory-dickory
nothing to commit, working tree clean
supicore@supicore1:~/Documents/git/rhymes$


### Step 3: Alice reviews and accepts Bob's simple changes ###


### Step 4: Bob makes lots of changes ###


### Step 5: Bob cleans up his work before submitting ###
