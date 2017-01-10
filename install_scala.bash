cd ~/Downloads
wget http://www.scala-lang.org/files/archive/scala-2.12.1.tgz
tar scala-2.12.1.tgz
sudo mv scala-2.12.1 /usr/local/share/
export SCALA_HOME="/usr/local/share/scala-2.12.1"
export PATH="$SCALA_HOME/bin:$PATH"
