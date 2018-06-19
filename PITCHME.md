---?image=assets/image/particles-1435361_1920.jpg

# What's new in Eclipse Xtext 2.14 ?


### Virtual Eclipse Webinar Series

---

## About us

@div[left-50 cover]
<img src="assets/image/HolgerS.png" height="300" alt="Holger"/>
<br>
Holger Schill
@divend

@div[right-50]
<img src="assets/image/karsten_sf.jpg" height="300" alt="Karsten"/>
<br>
Karsten Thoms
@divend


@div[bottom center]
<img src="assets/image/itemis-Marke-200.png" height="100" alt="itemis logo" style="border: 0"/>
@divend


---?image=assets/image/kyle-gregory-devaras.jpg

## Agenda

- Project Organization |
- Xtext Release History |
- Xtext 2.14 N&N |
- Xtend N&N |
- Outlook |
- Open Discussion |


---
# Project Organization


+++
@title[Project Statistics]

![Whos-Involved](assets/image/xtext-project-who-involved.png?size=auto 80%)


+++
@title[New Project Lead]

## Project Lead

![Image-Absolute](https://avatars2.githubusercontent.com/u/238736?s=300)

### Christian Dietrich

+++
@title[New Committers]

## New Committers

![Image-Absolute](https://blogs.itemis.com/hubfs/arne-deutsch-foto.jpg?t=1529339929635)

### Arne Deutsch

+++
@title[Contributors]

### Kudos to our
## Frequent Contributors

<table>
<tr>
<td>
![Image-Absolute](https://avatars3.githubusercontent.com/u/3389524?s=200)
<br/>
Titouan Vervack
<br/>
@fa[github] tivervac
</td>

<td>
![Image-Absolute](https://avatars2.githubusercontent.com/u/20393472?s=200)
<br/>
Tamas Miklossy
<br/>
@fa[github] miklossy
</td>
</tr>
</table>


---
## Xtext History

<iframe width="100%" height="400" src="https://time.graphics/embed?v=1&id=99959" frameborder="0" allowfullscreen></iframe>
<div><a style="font-size: 12px; text-decoration: none;" title="Xtext History" href="https://time.graphics/line/99959">Xtext History</a></div>



+++?image=assets/image/fireworks-574739_1920.jpg

# Happy 10th Anniversary !


<!--
  ****************************************************
  XTEXT 2.14
  ****************************************************
-->
---?image=assets/image/sunrise-1756274_1920.jpg

# Xtext 2.14
<br><br><br><br><br><br>

@size[0.5em](Participating in the Eclipse Photon Simultaneous Release)


<!--
  ****************************************************
  UPGRADE
  ****************************************************
-->
---?image=none

@div[top-20 size=auto 10%]
<img src="assets/image/update-1672359_1920.png" height="100"/>
@divend

- Gradle |
- Maven / Eclipse Tycho |
- Target Platform Definitions |
- ObjectWeb ASM Library |
- Orbit URL |
- Node.js |
- Oomph Setup |

<!--
  ****************************************************
  JAVA
  ****************************************************
-->
---?image=https://upload.wikimedia.org/wikipedia/de/thumb/e/e1/Java-Logo.svg/541px-Java-Logo.svg.png&size=auto 90%

+++
<img src="assets/image/screenshot-wizard-1.png" border="0"/>

<!--
  ****************************************************
  JUNIT 5
  ****************************************************
-->
---?image=https://junit.org/junit5/assets/img/junit5-logo.png&position=top 50px center&size=auto 35%

<span style="font-size:3em; color:white; text-align:center">JUnit 5</span>

<!--
  ****************************************************
  CODE MINING
  ****************************************************
-->
---?image=https://blogs.itemis.com/hs-fs/hubfs/Blog/Xtext/Code-Mining-Preview.jpg
@title[Code Mining]
s

+++?code=examples/domainmodel/org.eclipse.xtext.example.domainmodel/src/org/eclipse/xtext/example/domainmodel/GenerateDomainmodel.mwe2&title=Generator Workflow GenerateDomainmodel.mwe2
@[12](Import the CodeMiningFragment.)
@[57-60](Configure the CodeMiningFragment.)

+++?code=examples/domainmodel/org.eclipse.xtext.example.domainmodel.ui/src/org/eclipse/xtext/example/domainmodel/ui/codemining/DomainmodelCodeMiningProvider.java&lang=Java&title=DomainmodelCodeMiningProvider.java
@[32](Inherit from <code>org.eclipse.xtext.ui.codemining.AbstractXtextCodeMiningProvider</code>)
@[39-40](Implement <code>createCodeMinings()</code>)
@[42, 45](Collect all instances of <code>Operation</code> in the resource and loop)
@[47-49](Skip operations with an explicit return type)
@[51-55](Compute the inferred return type name)
@[57-60](Code Mining should be inserted after right paranthesis - find position within the Node Model)
@[62-63](Compute the displayed mining text and create a <strong>line content code mining</strong>)

<!--
  ****************************************************
  QUESTIONS
  ****************************************************
-->
---?image=assets/image/milky-way-2695569_1920.jpg
### Questions?

<br>
<table>
<tr>
  <td>@fa[twitter gp-contact](@kthoms)</td>
  <td>@fa[twitter gp-contact](@holgerschill)</td>
</tr>
<tr>
  <td>@fa[envelope-square](thoms@itemis.de)</td>
  <td>@fa[envelope-square](schill@itemis.de)</td>
</tr>
</table>

---
## Links

- Xtext 2.14 Release Notes: https://www.eclipse.org/Xtext/releasenotes.html#/releasenotes/2018/05/23/version-2-14-0
- Blog [“Xtext 2.14 adds support for JUnit 5“](https://blogs.itemis.com/en/xtext-2.14-adds-support-for-junit-5)
- Blog [“Code Mining Support in Xtext”](https://blogs.itemis.com/en/code-mining-support-in-xtext)
- Blog [“Generating a new project wizard with Xtext 2.14”](https://blogs.itemis.com/en/generating-a-new-project-wizard-with-xtext-2.14)
- Blog [“New File Wizard – easy to generate with Xtext 2.14”](https://blogs.itemis.com/en/new-file-wizard-easy-to-generate-with-xtext-2.14)
- Blog [“New Project Wizard: einfach mit Xtext 2.14 generieren” (German)](https://blogs.itemis.com/de/new-project-wizard-einfach-mit-xtext-2-14-generieren)
- Blog [“Erzeugen des New File Wizards” (German)](https://blogs.itemis.com/de/new-file-wizard-einfach-mit-xtext-2.14-generieren)
- [LSP4J Changelog](https://github.com/eclipse/lsp4j/blob/master/CHANGELOG.md) 

---
## Images

This presentation contains the following images:

<table>
<tr>
<th>URL</th>
<th>Name</th>
<th>License</th>
</tr>

<tr>
  <td>https://de.wikipedia.org/wiki/Datei:Java-Logo.svg</td>
  <td>Java Logo</td>
  <td>Public Domain</td>
  <!--
  <td><a href="https://creativecommons.org/licenses/by/2.0/">CC BY 2.0</a></td>
  -->
</table>

---?image=assets/image/milky-way-2695569_1920.jpg

---?code=sample/go/server.go&lang=golang&title=Golang File

@[1,3-6](Present code found within any repo source file.)
@[8-18](Without ever leaving your slideshow.)
@[19-28](Using GitPitch code-presenting with (optional) annotations.)

---?image=assets/image/john-reign-abarintos.jpg

@title[JavaScript Block]

<p><span class="slide-title">JavaScript Block</span></p>

```javascript
// Include http module.
var http = require("http");

// Create the server. Function passed as parameter
// is called on every request made.
http.createServer(function (request, response) {
  // Attach listener on end event.  This event is
  // called when client sent, awaiting response.
  request.on("end", function () {
    // Write headers to the response.
    // HTTP 200 status, Content-Type text/plain.
    response.writeHead(200, {
      'Content-Type': 'text/plain'
    });
    // Send data and end response.
    response.end('Hello HTTP!');
  });

// Listen on the 8080 port.
}).listen(8080);
```

@[1,2](You can present code inlined within your slide markdown too.)
@[9-17](Displayed using code-syntax highlighting just like your IDE.)
@[19-20](Again, all of this without ever leaving your slideshow.)

---?gist=onetapbeyond/494e0fecaf0d6a2aa2acadfb8eb9d6e8&lang=scala&title=Scala GIST

@[23](You can even present code found within any GitHub GIST.)
@[41-53](GIST source code is beautifully rendered on any slide.)
@[57-62](And code-presenting works seamlessly for GIST too, both online and offline.)

---?image=assets/image/kyle-gregory-devaras.jpg

## Template Help

- [Code Presenting](https://github.com/gitpitch/gitpitch/wiki/Code-Presenting)
  + [Repo Source](https://github.com/gitpitch/gitpitch/wiki/Code-Delimiter-Slides), [Static Blocks](https://github.com/gitpitch/gitpitch/wiki/Code-Slides), [GIST](https://github.com/gitpitch/gitpitch/wiki/GIST-Slides) 
- [Custom CSS Styling](https://github.com/gitpitch/gitpitch/wiki/Slideshow-Custom-CSS)
- [Slideshow Background Image](https://github.com/gitpitch/gitpitch/wiki/Background-Setting)
- [Slide-specific Background Images](https://github.com/gitpitch/gitpitch/wiki/Image-Slides#background)
- [Custom Logo](https://github.com/gitpitch/gitpitch/wiki/Logo-Setting), [TOC](https://github.com/gitpitch/gitpitch/wiki/Table-of-Contents), and [Footnotes](https://github.com/gitpitch/gitpitch/wiki/Footnote-Setting)

---?image=assets/image/kyle-gregory-devaras.jpg

## Go GitPitch Pro!

<br>
<div class="left">
    <i class="fa fa-user-secret fa-5x" aria-hidden="true"> </i><br>
    <a href="https://gitpitch.com/pro-features" class="pro-link">
    More details here.</a>
</div>
<div class="right">
    <ul>
        <li>Private Repos</li>
        <li>Private URLs</li>
        <li>Password-Protection</li>
        <li>Image Opacity</li>
        <li>SVG Image Support</li>
    </ul>
</div>


---?image=assets/image/gitpitch-audience.jpg

@title[Download this Template!]

### Get your presentation started!
### [Download this template @fa[external-link gp-download]](https://gitpitch.com/template/download/space)

