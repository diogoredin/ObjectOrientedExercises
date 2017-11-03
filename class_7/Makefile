OBJDIR ?= bld
DOCDIR = docs

PACKAGEDIR ?= editor
APPDIR ?= $(PACKAGEDIR).app.App
ZIPFILE = $(OBJDIR)/proj.jar
CLASSPATH = .:po-uilib.jar

EXEC = `find $(PACKAGEDIR) -name "*.java"`

# General rules
all:
	javac $(EXEC) -d $(OBJDIR)

docs: all
	javadoc $(EXEC) -d $(DOCDIR)

zip: #$(DOCDIR)
	jar cvf $(ZIPFILE) $(EXEC) #$(DOCDIR)/*.html

run:
	cd bld; java $(IMPORT) $(APPDIR); cd ..

clean:
	rm -rf $(OBJDIR)/* $(DOCDIR)/* `find ./$(PACKAGEDIR) -name "*.class"`