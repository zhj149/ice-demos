# **********************************************************************
#
# Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
#
# **********************************************************************

$(demo)_client_dependencies     = Ice Glacier2
$(demo)_client_sources          = Client.cpp Callback.ice CallbackI.cpp

demos += $(demo)
