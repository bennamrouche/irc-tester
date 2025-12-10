SRC =  src/alphaben/irc/ClientManger.java \
		src/alphaben/irc/ClientPanel.java  \
		src/alphaben/irc/ClinetMintor.java  \
		src/alphaben/irc/Frame.java \
		src/alphaben/irc/ByteFormater.java \
		src/alphaben/irc/GlobalConfig.java  \
		src/alphaben/irc/ircClient.java
build: $(SRC)
	javac -d ./build/classes/  $(SRC)
run: build 
	java -cp build/classes  alphaben.irc.Frame

clean:
	rm -rf  build/classes/alphaben/irc/* 
re  :clean  build 
.PHONY:  build 
