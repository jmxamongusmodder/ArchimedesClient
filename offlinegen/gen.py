import os,base64

template = open("template.html").read()

def epkToBase64(epkname):
    epk = open(f"../compiled/packs/{epkname}.epk","rb").read()
    return base64.b64encode(epk).decode("utf-8")

threebedwars = epkToBase64("3Bedwars")

default = epkToBase64("default")

toryeum = epkToBase64("toryeum")

qubit = epkToBase64("qubit16x")

def templatePatch(key, value):
    global template
    template = template.replace(key, value)

templatePatch("default_epk", default)
templatePatch("3Bedwars_epk", threebedwars) 
templatePatch("toryeum_epk", toryeum)
templatePatch("qubit16x_epk", qubit)

templatePatch("classes_js", open("../compiled/classes.js").read())
templatePatch("eagswebrtc_js", open("../compiled/eagswebrtc.js").read())
templatePatch("classes_server_js", open("../compiled/classes_server.js").read())

templatePatch("_css_", open("../compiled/style.css").read())

iconb64 = base64.b64encode(open("../compiled/favicon.png","rb").read()).decode("utf-8")
templatePatch("_logo_", iconb64)

templatePatch("_date_", os.popen("date").read())


open("../compiled/offline.html", "w").write(template)