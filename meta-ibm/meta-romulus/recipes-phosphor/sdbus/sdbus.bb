LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI += "file://CMakeLists.txt \
            file://main.cpp \
            "
S = "${WORKDIR}"
# DEPENDES += "sdbusplus \
#           systemd \
#           boost"
DEPENDS = "boost sdbusplus systemd"
inherit cmake

