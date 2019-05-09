@given(u'que estou no site da zoom')
def step_impl(context):
    context.logar.go_home()


@when(u'pesquiso o celular')
def step_impl(context):
    context.logar.pesquisar_c()


@then(u'seleciono ele')
def step_impl(context):
    context.logar.selecionar_c()


