import os,base64

template = open("template.html").read()

def epkToBase64(epkname):
    epk = open(f"../packs/{epkname}.epk","rb").read()
    return base64.b64encode(epk).decode("utf-8")

default = epkToBase64("default")

qubit = epkToBase64("qubit16x")

def templatePatch(key, value):
    global template
    template = template.replace(key, value)

templatePatch("default_epk", default)
templatePatch("qubit16x_epk", qubit)

templatePatch("classes_js", open("../classes.js").read())
templatePatch("eagswebrtc_js", open("../eagswebrtc.js").read())
templatePatch("classes_server_js", open("../classes_server.js").read())

templatePatch("_css_", open("../style.css").read())

templatePatch("_icon_", base64.b64encode(open("../logo.jpeg","rb").read()).decode("utf-8"))

templatePatch("_date_", os.popen("date").read())


open("../offline.html", "w").write(template)

print("generated offline.html at " + os.popen("date").read())
