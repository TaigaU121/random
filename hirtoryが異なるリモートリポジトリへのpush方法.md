# ”雑記”のリモートリポジトリにローカルのファイルをpushしようとした時にエラー

```
error: failed to push some refs to 'https://github.com/xxxx/xxxxx.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

```

の記述がでたので解決策  
<b>原因：リモートに無関係なヒストリーを持つローカルはpushできない仕様のため</b>


# 1. リモートの更新をローカルに持ってくる
$ git fetch <リモートのショートカット名>
でローカルにリモートリポジトリのmasterを持ってくる

# 2. 持ってきたリモートの更新をワークツリーに反映
$ git merge -allow-unrelated-histories <リモートのショートカット名>/master
で，ローカルに持ってきたリモートのmasterとワーキングツリーに反映させる

この手順で，ワーキングツリーに既存のリモートのmasterがmergeされていることがlsからわかる
ここまでくると，「リモートに関係があるヒストリーを持つローカル」からのpushということになり
remoteにpushすることができる．



