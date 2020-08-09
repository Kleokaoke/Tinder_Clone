SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./src/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Image.class Profile.class Database.class TinderApp.class DatabaseSwiper.class TinderSwipe.class

default: $(CLASSES)
	
Person.class: Person.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Image.class: Image.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Profile.class: Profile.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Database.class: Database.java 
	javac -d $(BINDIR) -cp $(JUNIT)
TinderApp.class: TinderApp.java 
	javac -d $(BINDIR) -cp $(JUNIT)
DatabaseSwiper.class: DatabaseSwiper.java 
	javac -d $(BINDIR) -cp $(JUNIT)
TinderSwipe.class: TinderSwipe.java 
	javac -d $(BINDIR) -cp $(JUNIT)

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc